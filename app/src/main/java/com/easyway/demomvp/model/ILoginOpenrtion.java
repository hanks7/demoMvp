package com.easyway.demomvp.model;

import com.easyway.demomvp.OnLoginListener;

public interface ILoginOpenrtion {
    void login(String name, String password, OnLoginListener listener);
}
