package wannabit.io.cosmostaion.network.res;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import wannabit.io.cosmostaion.model.kava.KavaPriceMarket;

public class ResKavaPriceFeedParam {
    @SerializedName("height")
    public String height;

    @SerializedName("result")
    public KavaPriceMarket result;

}

