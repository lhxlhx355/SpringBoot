package com.springboot.demo.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(length = 10)
    private String userName;
    @Column(length = 10)
    private String password;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password ) {
        this.password = password;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(int id,String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }
}
