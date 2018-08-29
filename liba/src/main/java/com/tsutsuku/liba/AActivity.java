package com.tsutsuku.liba;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @Author Renwei.Sun
 * @Create 2018/8/28
 * @Description Content
 */
@Route(path = "aa")
public class AActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aa);
    }
}
