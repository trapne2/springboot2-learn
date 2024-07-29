package com.example.springbootmybatisxml.model;

import com.example.springbootmybatisxml.enums.BsUserSexEnum;

import java.io.Serializable;

public class BsUser implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String passWord;
    private String email;
    private BsUserSexEnum userSex;

    public BsUserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(BsUserSexEnum userSex) {
        this.userSex = userSex;
    }

    public BsUser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userSex=" + userSex +
                '}';
    }
}
