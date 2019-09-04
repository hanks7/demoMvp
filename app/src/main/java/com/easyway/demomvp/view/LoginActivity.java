package com.easyway.demomvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.easyway.demomvp.presenter.LoginPresenterImpl;
import com.easyway.demomvp.R;
import com.easyway.demomvp.base.BaseActivity;

public class LoginActivity extends BaseActivity<ILoginView, LoginPresenterImpl> implements ILoginView {

    private EditText nameEdit, passwordEdit;
    private Button button;
    private LoginPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initClickListener();
    }

    @Override
    protected LoginPresenterImpl createPresenter() {
        presenter = new LoginPresenterImpl(this);
        return presenter;
    }

    private void initView() {


        nameEdit = findViewById(R.id.edt_account);
        passwordEdit = findViewById(R.id.edt_password);
        button = findViewById(R.id.btn_commit);


    }

    private void initClickListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login();

            }
        });
    }

    @Override
    public String getName() {

        return nameEdit.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return passwordEdit.getText().toString().trim();
    }

    @Override
    public void showLoginSucess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginError() {
        Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
    }
}