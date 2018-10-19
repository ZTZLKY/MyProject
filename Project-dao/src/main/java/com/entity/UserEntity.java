package com.entity;

public class UserEntity {
    private String username;
    private String passWord;

    public UserEntity(String username, String passWord) {
        this.username = username;
        this.passWord = passWord;
    }

    public UserEntity() {
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "username='" + username + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
