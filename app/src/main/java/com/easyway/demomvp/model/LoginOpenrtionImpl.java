package com.easyway.demomvp.model;

import com.easyway.demomvp.OnLoginListener;

public class LoginOpenrtionImpl implements ILoginOpenrtion {
    @Override
    public void login(String name, String password, OnLoginListener listener) {
        if ("niezhangyu".equals(name) && "123456".equals(password)) {
            LoginData data=new LoginData();
            data.setName(name);
            data.setPassword(password);
            listener.loginSucess(data);
        } else {
            listener.loginFail();
        }
    }
}
