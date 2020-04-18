package com.sliit.mtit.microservice.UserSignUpService.dto;

import java.util.StringJoiner;

public class UserSignUpRequest {

    private String firstName;
    private String lastName;
    private String userName;
    private String address;
    private String email;
    private String password;
    private String confirmPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserSignUpRequest.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("userName='" + userName + "'")
                .add("address='" + address + "'")
                .add("email='" + email + "'")
                .add("password='" + password + "'")
                .add("confirmPassword='" + confirmPassword + "'")
                .toString();
    }
}
