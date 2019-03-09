package com.homework.LoginPage;

import com.homework.PageObject;

public class LoginData extends PageObject {
    private String login;
    private String password = "khg";

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LoginData(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
