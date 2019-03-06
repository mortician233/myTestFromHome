package com.homework;

public class UserData {
    private final String login;
    private final String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserData(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
