package com.easyway.demomvp.presenter;

import com.easyway.demomvp.OnLoginListener;
import com.easyway.demomvp.base.BasePresenter;
import com.easyway.demomvp.model.LoginData;
import com.easyway.demomvp.model.LoginOpenrtionImpl;
import com.easyway.demomvp.view.ILoginView;

public class LoginPresenterImpl extends BasePresenter<ILoginView> {

    private ILoginView loginview;
    private LoginOpenrtionImpl oper;

    public LoginPresenterImpl(ILoginView view){
        this.loginview=view;
        this.oper=new LoginOpenrtionImpl();
    }

    public void login(){
        oper.login(loginview.getName(), loginview.getPassword(), new OnLoginListener() {
            @Override
            public void loginSucess(LoginData data) {
                loginview.showLoginSucess();
            }

            @Override
            public void loginFail() {
                loginview.showLoginError();
            }
        });
    }

}
