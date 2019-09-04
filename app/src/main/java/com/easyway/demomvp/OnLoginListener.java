package com.easyway.demomvp;

import com.easyway.demomvp.model.LoginData;

public interface OnLoginListener {
    void loginSucess(LoginData data);

    void loginFail();

}
