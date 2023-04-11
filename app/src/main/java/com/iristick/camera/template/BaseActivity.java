package com.iristick.camera.template;

import android.app.Activity;
import android.content.Context;

import com.iristick.smartglass.support.app.IristickApp;

public class BaseActivity extends Activity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(IristickApp.wrapContext(newBase));
    }
}
