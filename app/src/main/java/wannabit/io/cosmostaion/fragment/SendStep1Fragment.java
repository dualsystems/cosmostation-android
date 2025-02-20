package wannabit.io.cosmostaion.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import wannabit.io.cosmostaion.R;
import wannabit.io.cosmostaion.activities.SendActivity;
import wannabit.io.cosmostaion.base.BaseFragment;
import wannabit.io.cosmostaion.dao.BnbToken;
import wannabit.io.cosmostaion.dialog.Dialog_Empty_Warnning;
import wannabit.io.cosmostaion.model.type.Coin;
import wannabit.io.cosmostaion.utils.WDp;
import wannabit.io.cosmostaion.utils.WUtil;

import static wannabit.io.cosmostaion.base.BaseChain.BNB_MAIN;
import static wannabit.io.cosmostaion.base.BaseChain.BNB_TEST;
import static wannabit.io.cosmostaion.base.BaseChain.KAVA_MAIN;
import static wannabit.io.cosmostaion.base.BaseChain.KAVA_TEST;
import static wannabit.io.cosmostaion.base.BaseChain.OKEX_MAIN;
import static wannabit.io.cosmostaion.base.BaseChain.OK_TEST;
import static wannabit.io.cosmostaion.base.BaseChain.SIF_MAIN;
import static wannabit.io.cosmostaion.base.BaseChain.isGRPC;
import static wannabit.io.cosmostaion.base.BaseConstant.CONST_PW_TX_SIMPLE_SEND;

public class SendStep1Fragment extends BaseFragment implements View.OnClickListener {

    private Button              mBefore, mNextBtn;
    private EditText            mAmountInput;
    private TextView            mAvailableAmount;
    private TextView            mDenomTitle;
    private ImageView           mClearAll;
    private Button              mAdd01, mAdd1, mAdd10, mAdd100, mAddHalf, mAddMax;
    private BigDecimal          mMaxAvailable = BigDecimal.ZERO;

    private ArrayList<Coin>     mToSendCoins = new ArrayList<>();
    private int                 mDpDecimal = 6;
    private String              mDecimalChecker, mDecimalSetter;


    public static SendStep1Fragment newInstance(Bundle bundle) {
        SendStep1Fragment fragment = new SendStep1Fragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_send_step1, container, false);
        mBefore = rootView.findViewById(R.id.btn_before);
        mNextBtn = rootView.findViewById(R.id.btn_next);
        mAmountInput = rootView.findViewById(R.id.et_amount_coin);
        mAvailableAmount = rootView.findViewById(R.id.tv_max_coin);
        mDenomTitle = rootView.findViewById(R.id.tv_symbol_coin);
        mClearAll = rootView.findViewById(R.id.clearAll);
        mAdd01 = rootView.findViewById(R.id.btn_add_01);
        mAdd1 = rootView.findViewById(R.id.btn_add_1);
        mAdd10 = rootView.findViewById(R.id.btn_add_10);
        mAdd100 = rootView.findViewById(R.id.btn_add_100);
        mAddHalf = rootView.findViewById(R.id.btn_add_half);
        mAddMax = rootView.findViewById(R.id.btn_add_all);
        mBefore.setOnClickListener(this);
        mNextBtn.setOnClickListener(this);
        mClearAll.setOnClickListener(this);
        mAdd01.setOnClickListener(this);
        mAdd1.setOnClickListener(this);
        mAdd10.setOnClickListener(this);
        mAdd100.setOnClickListener(this);
        mAddHalf.setOnClickListener(this);
        mAddMax.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!isAdded() || getSActivity() == null || getSActivity().mAccount == null) {
            getSActivity().onBackPressed();
        }

        final String mainDenom = WDp.mainDenom(getSActivity().mBaseChain);
        final String toSendDenom = getSActivity().mDenom;
        final BigDecimal feeAmount = WUtil.getEstimateGasFeeAmount(getContext(), getSActivity().mBaseChain, CONST_PW_TX_SIMPLE_SEND, 0);
        if (isGRPC(getSActivity().mBaseChain)) {
            if (getSActivity().mDenom.startsWith("ibc/")) {
                mDpDecimal = WUtil.getIbcDecimal(getBaseDao(), getSActivity().mDenom);
            } else if (getSActivity().mBaseChain.equals(SIF_MAIN)) {
                mDpDecimal = WUtil.getSifCoinDecimal(getBaseDao(), getSActivity().mDenom);
            } else {
                mDpDecimal = WDp.mainDisplayDecimal(getSActivity().mBaseChain);
            }
            setDisplayDecimals(mDpDecimal);
            if (toSendDenom.equals(mainDenom)) {
                mMaxAvailable = getBaseDao().getAvailable(toSendDenom).subtract(feeAmount);
                WDp.showCoinDp(getContext(), getBaseDao(), toSendDenom, mMaxAvailable.toPlainString(), mDenomTitle, mAvailableAmount, getSActivity().mBaseChain);

            } else {
                mMaxAvailable = getBaseDao().getAvailable(toSendDenom);
                WDp.showCoinDp(getContext(), getBaseDao(), toSendDenom, mMaxAvailable.toPlainString(), mDenomTitle, mAvailableAmount, getSActivity().mBaseChain);
            }

        } else {
            if (getSActivity().mBaseChain.equals(BNB_MAIN) || getSActivity().mBaseChain.equals(BNB_TEST)) {
                mDpDecimal = WDp.mainDisplayDecimal(getSActivity().mBaseChain);
            } else if (getSActivity().mBaseChain.equals(KAVA_MAIN) || getSActivity().mBaseChain.equals(KAVA_TEST)) {
                mDpDecimal = WUtil.getKavaCoinDecimal(toSendDenom);
            } else if (getSActivity().mBaseChain.equals(OKEX_MAIN) || getSActivity().mBaseChain.equals(OK_TEST)) {
                mDpDecimal = WDp.mainDisplayDecimal(getSActivity().mBaseChain);
            } else if (getSActivity().mBaseChain.equals(SIF_MAIN)) {
                mDpDecimal = WUtil.getSifCoinDecimal(getBaseDao(), toSendDenom);
            } else {
                mDpDecimal = WDp.mainDisplayDecimal(getSActivity().mBaseChain);
            }

            setDisplayDecimals(mDpDecimal);
            if (toSendDenom.equals(mainDenom)) {
                mMaxAvailable = getBaseDao().availableAmount(toSendDenom).subtract(feeAmount);
            } else {
                mMaxAvailable = getBaseDao().availableAmount(toSendDenom);
            }
            WDp.showCoinDp(getContext(), getBaseDao(), toSendDenom, mMaxAvailable.toPlainString(), mDenomTitle, mAvailableAmount, getSActivity().mBaseChain);

        }
        onAddAmountWatcher();
    }


    private void onAddAmountWatcher() {
        mAmountInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable et) {
                String es = et.toString().trim();
                if(TextUtils.isEmpty(es)) {
                    mAmountInput.setBackground(getResources().getDrawable(R.drawable.edittext_box));
                } else if (es.startsWith(".")) {
                    mAmountInput.setBackground(getResources().getDrawable(R.drawable.edittext_box));
                    mAmountInput.setText("");
                } else if (es.endsWith(".")) {
                    mAmountInput.setBackground(getResources().getDrawable(R.drawable.edittext_box_error));
                    mAmountInput.setVisibility(View.VISIBLE);
                } else if(es.length() > 1 && es.startsWith("0") && !es.startsWith("0.")) {
                    mAmountInput.setText("0");
                    mAmountInput.setSelection(1);
                }

                if (es.equals(mDecimalChecker)) {
                    mAmountInput.setText(mDecimalSetter);
                    mAmountInput.setSelection(mDpDecimal + 1);
                } else {
                    try {
                        final BigDecimal inputAmount = new BigDecimal(es);
                        if (BigDecimal.ZERO.compareTo(inputAmount) >= 0 ){
                            mAmountInput.setBackground(getResources().getDrawable(R.drawable.edittext_box_error));
                            return;
                        }

                        BigDecimal checkPosition = inputAmount.movePointRight(mDpDecimal);
                        BigDecimal checkMax = checkPosition.setScale(0, RoundingMode.DOWN);
                        if (checkPosition.compareTo(checkMax) != 0 || !checkPosition.equals(checkMax)) {
                            String recover = es.substring(0, es.length() - 1);
                            mAmountInput.setText(recover);
                            mAmountInput.setSelection(recover.length());
                            return;
                        }

                        if (getSActivity().mBaseChain.equals(BNB_MAIN) || getSActivity().mBaseChain.equals(OKEX_MAIN)  || getSActivity().mBaseChain.equals(BNB_TEST)|| getSActivity().mBaseChain.equals(OK_TEST)) {
                            if (inputAmount.compareTo(mMaxAvailable) > 0) {
                                mAmountInput.setBackground(getResources().getDrawable(R.drawable.edittext_box_error));
                            } else {
                                mAmountInput.setBackground(getResources().getDrawable(R.drawable.edittext_box));
                            }

                        } else {
                            if (inputAmount.compareTo(mMaxAvailable.movePointLeft(mDpDecimal).setScale(mDpDecimal, RoundingMode.CEILING)) > 0) {
                                mAmountInput.setBackground(getResources().getDrawable(R.drawable.edittext_box_error));
                            } else {
                                mAmountInput.setBackground(getResources().getDrawable(R.drawable.edittext_box));
                            }
                        }
                        mAmountInput.setSelection(mAmountInput.getText().length());
                    } catch (Exception e) { }
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.equals(mBefore)) {
            getSActivity().onBeforeStep();

        } else if (v.equals(mNextBtn)) {
            if(isValidateSendAmount()) {
                getSActivity().mAmounts = mToSendCoins;
                getSActivity().onNextStep();
            } else {
                Toast.makeText(getContext(), R.string.error_invalid_amount, Toast.LENGTH_SHORT).show();
            }
        } else if (v.equals(mAdd01)) {
            BigDecimal existed = BigDecimal.ZERO;
            String es = mAmountInput.getText().toString().trim();
            if (es.length() > 0) {
                existed = new BigDecimal(es);
            }
            mAmountInput.setText(existed.add(new BigDecimal("0.1")).toPlainString());

        } else if (v.equals(mAdd1)) {
            BigDecimal existed = BigDecimal.ZERO;
            String es = mAmountInput.getText().toString().trim();
            if(es.length() > 0) {
                existed = new BigDecimal(es);
            }
            mAmountInput.setText(existed.add(new BigDecimal("1")).toPlainString());

        } else if (v.equals(mAdd10)) {
            BigDecimal existed = BigDecimal.ZERO;
            String es = mAmountInput.getText().toString().trim();
            if(es.length() > 0) {
                existed = new BigDecimal(es);
            }
            mAmountInput.setText(existed.add(new BigDecimal("10")).toPlainString());

        } else if (v.equals(mAdd100)) {
            BigDecimal existed = BigDecimal.ZERO;
            String es = mAmountInput.getText().toString().trim();
            if(es.length() > 0) {
                existed = new BigDecimal(es);
            }
            mAmountInput.setText(existed.add(new BigDecimal("100")).toPlainString());

        } else if (v.equals(mAddHalf)) {
            if (getSActivity().mBaseChain.equals(BNB_MAIN) || getSActivity().mBaseChain.equals(OKEX_MAIN) || getSActivity().mBaseChain.equals(BNB_TEST) || getSActivity().mBaseChain.equals(OK_TEST)) {
                BigDecimal half = mMaxAvailable.divide(new BigDecimal("2"), mDpDecimal, RoundingMode.DOWN);
                mAmountInput.setText(half.toPlainString());

            } else {
                BigDecimal half = mMaxAvailable.movePointLeft(mDpDecimal).divide(new BigDecimal("2"), mDpDecimal, RoundingMode.DOWN);
                mAmountInput.setText(half.toPlainString());
            }

        } else if (v.equals(mAddMax)) {
            if (getSActivity().mBaseChain.equals(BNB_MAIN) || getSActivity().mBaseChain.equals(OKEX_MAIN) || getSActivity().mBaseChain.equals(BNB_TEST) || getSActivity().mBaseChain.equals(OK_TEST)) {
                mAmountInput.setText(mMaxAvailable.toPlainString());
            } else {
                mAmountInput.setText(mMaxAvailable.movePointLeft(mDpDecimal).setScale(mDpDecimal, RoundingMode.DOWN).toPlainString());
            }
            onShowEmptyBlanaceWarnDialog();

        } else if (v.equals(mClearAll)) {
            mAmountInput.setText("");

        }

    }

    private boolean isValidateSendAmount() {
        mToSendCoins.clear();
        try {
            if (isGRPC(getSActivity().mBaseChain)) {
                BigDecimal sendTemp = new BigDecimal(mAmountInput.getText().toString().trim());
                if (sendTemp.compareTo(BigDecimal.ZERO) <= 0) return false;
                if (sendTemp.compareTo(mMaxAvailable.movePointLeft(mDpDecimal).setScale(mDpDecimal, RoundingMode.CEILING)) > 0) return false;
                Coin coin = new Coin(getSActivity().mDenom, sendTemp.movePointRight(mDpDecimal).setScale(0).toPlainString());
                mToSendCoins.add(coin);
                return true;

            } else {
                if (getSActivity().mBaseChain.equals(BNB_MAIN) || getSActivity().mBaseChain.equals(BNB_TEST)) {
                    BigDecimal sendTemp = new BigDecimal(mAmountInput.getText().toString().trim());
                    if (sendTemp.compareTo(BigDecimal.ZERO) <= 0) return false;
                    if (sendTemp.compareTo(mMaxAvailable) > 0) return false;
                    if (getSActivity().mBnbToken.type == BnbToken.BNB_TOKEN_TYPE_MINI) {
                        if ((sendTemp.compareTo(BigDecimal.ONE) < 0) && (sendTemp.compareTo(mMaxAvailable) != 0)) {
                            Toast.makeText(getContext(), R.string.error_bnb_mini_amount, Toast.LENGTH_SHORT).show();
                            return false;
                        }
                    }
                    Coin token = new Coin(getSActivity().mBnbToken.symbol, sendTemp.toPlainString());
                    mToSendCoins.add(token);
                    return true;

                } else if (getSActivity().mBaseChain.equals(OKEX_MAIN) || getSActivity().mBaseChain.equals(OK_TEST)) {
                    BigDecimal sendTemp = new BigDecimal(mAmountInput.getText().toString().trim());
                    if (sendTemp.compareTo(BigDecimal.ZERO) <= 0) return false;
                    if (sendTemp.compareTo(mMaxAvailable) > 0) return false;
                    Coin coin = new Coin(getSActivity().mDenom, sendTemp.setScale(mDpDecimal).toPlainString());
                    mToSendCoins.add(coin);
                    return true;

                } else if (getSActivity().mBaseChain.equals(KAVA_MAIN) || getSActivity().mBaseChain.equals(KAVA_TEST)) {
                    BigDecimal sendTemp = new BigDecimal(mAmountInput.getText().toString().trim());
                    if (sendTemp.compareTo(BigDecimal.ZERO) <= 0) return false;
                    if (sendTemp.compareTo(mMaxAvailable.movePointLeft(mDpDecimal).setScale(mDpDecimal, RoundingMode.CEILING)) > 0) return false;
                    Coin coin = new Coin(getSActivity().mDenom, sendTemp.movePointRight(mDpDecimal).setScale(0).toPlainString());
                    mToSendCoins.add(coin);
                    return true;

                } else if (getSActivity().mBaseChain.equals(SIF_MAIN)) {
                    BigDecimal sendTemp = new BigDecimal(mAmountInput.getText().toString().trim());
                    if (sendTemp.compareTo(BigDecimal.ZERO) <= 0) return false;
                    if (sendTemp.compareTo(mMaxAvailable.movePointLeft(mDpDecimal).setScale(mDpDecimal, RoundingMode.CEILING)) > 0) return false;
                    Coin coin = new Coin(getSActivity().mDenom, sendTemp.movePointRight(mDpDecimal).setScale(0).toPlainString());
                    mToSendCoins.add(coin);
                    return true;
                }

                else {
                    BigDecimal sendTemp = new BigDecimal(mAmountInput.getText().toString().trim());
                    if (sendTemp.compareTo(BigDecimal.ZERO) <= 0) return false;
                    if (sendTemp.compareTo(mMaxAvailable.movePointLeft(mDpDecimal).setScale(mDpDecimal, RoundingMode.CEILING)) > 0) return false;
                    Coin coin = new Coin(getSActivity().mDenom, sendTemp.movePointRight(mDpDecimal).setScale(0).toPlainString());
                    mToSendCoins.add(coin);
                    return true;
                }

            }

        } catch (Exception e) {
            mToSendCoins.clear();
            return false;
        }
    }

    private void onShowEmptyBlanaceWarnDialog() {
        Dialog_Empty_Warnning dialog = Dialog_Empty_Warnning.newInstance();
        dialog.setCancelable(true);
        dialog.show(getFragmentManager().beginTransaction(), "dialog");
    }

    private void setDisplayDecimals(int decimals) {
        mDecimalChecker = "0.";
        mDecimalSetter = "0.";
        for (int i = 0; i < decimals; i ++) {
            mDecimalChecker = mDecimalChecker+"0";
        }
        for (int i = 0; i < decimals-1; i ++) {
            mDecimalSetter = mDecimalSetter+"0";
        }
    }

    private SendActivity getSActivity() {
        return (SendActivity)getBaseActivity();
    }


}
