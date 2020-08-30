package com.example.bestcommerce.models;

import org.springframework.stereotype.Component;

@Component
public class In {
    private String userName, password;
    protected boolean sessionForAWeek;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSessionForAWeek() {
        return sessionForAWeek;
    }

    public void setSessionForAWeek(boolean sessionForAWeek) {
        this.sessionForAWeek = sessionForAWeek;
    }
}
