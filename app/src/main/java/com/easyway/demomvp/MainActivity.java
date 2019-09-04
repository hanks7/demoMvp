package com.easyway.demomvp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.easyway.demomvp.base.BaseActivity;
import com.easyway.demomvp.base.BasePresenter;
import com.easyway.demomvp.view.LoginActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }

    public void intentActivity(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
