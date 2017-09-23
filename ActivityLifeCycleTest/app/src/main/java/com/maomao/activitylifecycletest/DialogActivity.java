package com.maomao.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by maomao on 9/22/17.
 */

public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
    }
}
