package com.android.myeyepetizer.multitype;

import android.support.annotation.NonNull;

import com.android.myeyepetizer.gson.Data;

/**
 * Created by Administrator on 2017/9/6.
 */

public class HomeItemCollection {

    @NonNull public Data data;

    public HomeItemCollection(@NonNull Data data) {
        this.data = data;
    }
}
