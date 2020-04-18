package com.sliit.mtit.microservice.UserSignInService.dto;

import java.util.StringJoiner;

public class UserSignInRequest {

    private String userName;
    private String email;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserSignInRequest.class.getSimpleName() + "[", "]")
                .add("userName='" + userName + "'")
                .add("email='" + email + "'")
                .add("password='" + password + "'")
                .toString();
    }
}
