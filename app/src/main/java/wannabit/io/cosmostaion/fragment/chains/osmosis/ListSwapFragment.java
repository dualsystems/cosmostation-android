package wannabit.io.cosmostaion.fragment.chains.osmosis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import osmosis.gamm.v1beta1.BalancerPoolOuterClass.BalancerPool;
import osmosis.gamm.v1beta1.BalancerPoolOuterClass.PoolAsset;
import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.activities.chains.osmosis.LabsListActivity;
import wannabit.io.cosmostaion.base.BaseFragment;
import wannabit.io.cosmostaion.dialog.Dialog_Swap_Coin_List;
import wannabit.io.cosmostaion.utils.WDp;
import wannabit.io.cosmostaion.utils.WLog;
import wannabit.io.cosmostaion.utils.WUtil;

public class ListSwapFragment extends BaseFragment implements View.OnClickListener {
    public final static int SELECT_INPUT_CHAIN = 8500;
    public final static int SELECT_OUTPUT_CHAIN = 8501;

    private RelativeLayout mBtnInputCoinList, mBtnOutputCoinList;
    private ImageView mInputImg;
    private TextView mInputCoin, mInputAmount;
    private TextView mSwapFee, mSwapSlippage;
    private TextView mSwapTitle;
    private ImageView mOutputImg;
    private TextView mOutputCoin;
    private TextView mSwapInputCoinRate, mSwapInputCoinSymbol, mSwapOutputCoinRate, mSwapOutputCoinSymbol;
    private TextView mSwapInputCoinExRate, mSwapInputCoinExSymbol, mSwapOutputCoinExRate, mSwapOutputCoinExSymbol;
    private ImageButton mBtnToggle;
    private Button  mBtnSwapStart;

    public ArrayList<BalancerPool>      mPoolList = new ArrayList<>();
    public ArrayList<String>            mAllDenoms = new ArrayList<>();
    public ArrayList<BalancerPool>      mSwapablePools = new ArrayList<>();
    public ArrayList<String>            mSwapableDenoms = new ArrayList<>();
    public BalancerPool                 mSelectedPool;
    public String                       mInputCoinDenom;
    public String                       mOutputCoinDenom;

    public static ListSwapFragment newInstance(Bundle bundle) {
        ListSwapFragment fragment = new ListSwapFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_swap_list, container, false);
        mBtnInputCoinList           = rootView.findViewById(R.id.btn_to_input_coin);
        mBtnOutputCoinList          = rootView.findViewById(R.id.btn_to_output_coin);

        mInputImg                   = rootView.findViewById(R.id.img_input_coin);
        mInputCoin                  = rootView.findViewById(R.id.txt_input_coin);
        mInputAmount                = rootView.findViewById(R.id.inpus_amount);
        mOutputImg                  = rootView.findViewById(R.id.img_output_coin);
        mOutputCoin                 = rootView.findViewById(R.id.txt_output_coin);

        mSwapTitle                  = rootView.findViewById(R.id.swap_title);
        mSwapInputCoinRate          = rootView.findViewById(R.id.inputs_rate);
        mSwapInputCoinSymbol        = rootView.findViewById(R.id.inputs_rate_symbol);
        mSwapOutputCoinRate         = rootView.findViewById(R.id.outputs_rate);
        mSwapOutputCoinSymbol       = rootView.findViewById(R.id.outputs_rate_symbol);

        mSwapInputCoinExRate        = rootView.findViewById(R.id.global_inputs_rate);
        mSwapInputCoinExSymbol      = rootView.findViewById(R.id.global_inputs_rate_symbol);
        mSwapOutputCoinExRate       = rootView.findViewById(R.id.global_outputs_rate);
        mSwapOutputCoinExSymbol     = rootView.findViewById(R.id.global_outputs_rate_symbol);

        mSwapFee                    = rootView.findViewById(R.id.token_swap_fee);
        mSwapSlippage               = rootView.findViewById(R.id.swap_slippage);
        mBtnToggle                  = rootView.findViewById(R.id.btn_toggle);
        mBtnSwapStart               = rootView.findViewById(R.id.btn_start_swap);

        mBtnInputCoinList.setOnClickListener(this);
        mBtnOutputCoinList.setOnClickListener(this);
        mBtnToggle.setOnClickListener(this);
        mBtnSwapStart.setOnClickListener(this);

        mBtnToggle.setBackgroundTintList(getResources().getColorStateList(R.color.colorOsmosis));
        mSwapTitle.setText(getString(R.string.str_swap_osmosis));
        return rootView;
    }

    @Override
    public void onRefreshTab() {
        mPoolList = getSActivity().mPoolList;
        mAllDenoms = getSActivity().mAllDenoms;

        if (mSelectedPool == null || mInputCoinDenom.isEmpty() || mOutputCoinDenom.isEmpty()) {
            mSelectedPool = mPoolList.get(0);
            mInputCoinDenom = "uosmo";
            mOutputCoinDenom = "ibc/27394FB092D2ECCD56123C74F36E4C1F926001CEADA9CA97EA622B25F41E5EB2";
        }
        onUpdateView();
    }

    private void onUpdateView() {
        int inputDecimal = WUtil.getOsmosisCoinDecimal(getBaseDao(), mInputCoinDenom);
        WUtil.dpOsmosisTokenName(getSActivity(), getBaseDao(), mInputCoin, mInputCoinDenom);
        WUtil.DpOsmosisTokenImg(getBaseDao(), mInputImg, mInputCoinDenom);
        WUtil.dpOsmosisTokenName(getSActivity(), getBaseDao(), mOutputCoin, mOutputCoinDenom);
        WUtil.DpOsmosisTokenImg(getBaseDao(), mOutputImg, mOutputCoinDenom);

        mInputAmount.setText(WDp.getDpAmount2(getSActivity(), getBaseDao().getAvailable(mInputCoinDenom), inputDecimal, inputDecimal));
        mSwapSlippage.setText(WDp.getPercentDp(new BigDecimal("3")));
        BigDecimal swapFee = new BigDecimal(mSelectedPool.getPoolParams().getSwapFee());
        mSwapFee.setText(WDp.getPercentDp(swapFee.movePointLeft(16)));

        final int inputCoinDecimal = WUtil.getOsmosisCoinDecimal(getBaseDao(), mInputCoinDenom);
        final int outCoinDecimal = WUtil.getOsmosisCoinDecimal(getBaseDao(), mOutputCoinDenom);

        BigDecimal inputAssetAmount = BigDecimal.ZERO;
        BigDecimal inputAssetWeight = BigDecimal.ZERO;
        BigDecimal outputAssetAmount = BigDecimal.ZERO;
        BigDecimal outputAssetWeight = BigDecimal.ZERO;

        for (PoolAsset asset: mSelectedPool.getPoolAssetsList()) {
            if (asset.getToken().getDenom().equals(mInputCoinDenom)) {
                inputAssetAmount = new BigDecimal(asset.getToken().getAmount());
                inputAssetWeight = new BigDecimal(asset.getWeight());
            }
            if (asset.getToken().getDenom().equals(mOutputCoinDenom)) {
                outputAssetAmount = new BigDecimal(asset.getToken().getAmount());
                outputAssetWeight = new BigDecimal(asset.getWeight());
            }
        }
        inputAssetAmount = inputAssetAmount.movePointLeft(WUtil.getOsmosisCoinDecimal(getBaseDao(), mInputCoinDenom));
        outputAssetAmount = outputAssetAmount.movePointLeft(WUtil.getOsmosisCoinDecimal(getBaseDao(), mOutputCoinDenom));
        BigDecimal swapRate = outputAssetAmount.multiply(inputAssetWeight).divide(inputAssetAmount, 16, RoundingMode.DOWN).divide(outputAssetWeight, 16, RoundingMode.DOWN);

        mSwapInputCoinRate.setText(WDp.getDpAmount2(getContext(), BigDecimal.ONE, 0, inputCoinDecimal));
        WUtil.dpOsmosisTokenName(getSActivity(), getBaseDao(), mSwapInputCoinSymbol, mInputCoinDenom);
        mSwapOutputCoinRate.setText(WDp.getDpAmount2(getContext(), swapRate, 0, outCoinDecimal));
        WUtil.dpOsmosisTokenName(getSActivity(), getBaseDao(), mSwapOutputCoinSymbol, mOutputCoinDenom);

        WUtil.dpOsmosisTokenName(getSActivity(), getBaseDao(), mSwapInputCoinExSymbol, mInputCoinDenom);
        WUtil.dpOsmosisTokenName(getSActivity(), getBaseDao(), mSwapOutputCoinExSymbol, mOutputCoinDenom);

        BigDecimal priceInput = WDp.perUsdValue(getBaseDao(), getBaseDao().getBaseDenom(mInputCoinDenom));
        BigDecimal priceOutput = WDp.perUsdValue(getBaseDao(), getBaseDao().getBaseDenom(mOutputCoinDenom));
        BigDecimal priceRate = BigDecimal.ZERO;
        if (priceInput.compareTo(BigDecimal.ZERO) == 0 || priceOutput.compareTo(BigDecimal.ZERO) == 0) {
            mSwapOutputCoinExRate.setText("??????");
        } else {
            priceRate = priceInput.divide(priceOutput, 6, RoundingMode.DOWN);
            mSwapOutputCoinExRate.setText(WDp.getDpAmount2(getContext(), priceRate, 0, outCoinDecimal));
        }
        mSwapInputCoinExRate.setText(WDp.getDpAmount2(getContext(), BigDecimal.ONE, 0, inputCoinDecimal));
    }

    @Override
    public void onClick(View v) {
        if (v.equals(mBtnInputCoinList)) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("denoms", mAllDenoms);
            Dialog_Swap_Coin_List dialog = Dialog_Swap_Coin_List.newInstance(bundle);
            dialog.setTargetFragment(this, SELECT_INPUT_CHAIN);
            getFragmentManager().beginTransaction().add(dialog, "dialog").commitNowAllowingStateLoss();

        } else if (v.equals(mBtnOutputCoinList)) {
            mSwapablePools.clear();
            mSwapableDenoms.clear();
            for (BalancerPool pool: mPoolList) {
                for (PoolAsset asset: pool.getPoolAssetsList()) {
                    if (asset.getToken().getDenom().equals(mInputCoinDenom)) {
                        mSwapablePools.add(pool);
                        break;
                    }
                }
            }
            WLog.w("mSwapablePools " +  mSwapablePools.size());
            for (BalancerPool sPool: mSwapablePools) {
                for (PoolAsset asset: sPool.getPoolAssetsList()) {
                    if (!asset.getToken().getDenom().equals(mInputCoinDenom)) {
                        mSwapableDenoms.add(asset.getToken().getDenom());
                    }
                }
            }
            WLog.w("mSwapableDenoms " +  mSwapableDenoms.size());

            Bundle bundle = new Bundle();
            bundle.putStringArrayList("denoms", mSwapableDenoms);
            Dialog_Swap_Coin_List dialog = Dialog_Swap_Coin_List.newInstance(bundle);
            dialog.setCancelable(true);
            dialog.setTargetFragment(this, SELECT_OUTPUT_CHAIN);
            getFragmentManager().beginTransaction().add(dialog, "dialog").commitNowAllowingStateLoss();

        } else if (v.equals(mBtnToggle)) {
            String temp = mInputCoinDenom;
            mInputCoinDenom = mOutputCoinDenom;
            mOutputCoinDenom = temp;
            onUpdateView();

        } else if (v.equals(mBtnSwapStart)) {
            getSActivity().onStartSwap(mInputCoinDenom, mOutputCoinDenom, mSelectedPool.getId());
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == SELECT_INPUT_CHAIN && resultCode == Activity.RESULT_OK) {
            mInputCoinDenom = mAllDenoms.get(data.getIntExtra("selectedDenom", 0));
            loop : for (BalancerPool pool: mPoolList) {
                for (PoolAsset asset: pool.getPoolAssetsList()) {
                    if (asset.getToken().getDenom().equals(mInputCoinDenom)) {
                        mSelectedPool = pool;
                        break loop;
                    }
                }
            }
            for (PoolAsset asset: mSelectedPool.getPoolAssetsList()) {
                if (!asset.getToken().getDenom().equals(mInputCoinDenom)) {
                    mOutputCoinDenom = asset.getToken().getDenom();
                    break;
                }
            }
            onUpdateView();

        } else if (requestCode == SELECT_OUTPUT_CHAIN && resultCode == Activity.RESULT_OK) {
            mOutputCoinDenom = mSwapableDenoms.get(data.getIntExtra("selectedDenom", 0));
            loop : for (BalancerPool pool: mSwapablePools) {
                for (PoolAsset asset: pool.getPoolAssetsList()) {
                    if (asset.getToken().getDenom().equals(mOutputCoinDenom)) {
                        mSelectedPool = pool;
                        break loop;
                    }
                }
            }
            onUpdateView();
        }
    }

    private LabsListActivity getSActivity() { return (LabsListActivity)getBaseActivity(); }
}
