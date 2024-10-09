package com.example.facebook_api.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.sql.Timestamp;

@Table(schema = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userID;

    private String userName;
    private String userImage;
    private boolean active;
    private Timestamp joiningData;

    public User(){}

    public User(String userID, String userName, String userImage, boolean active, Timestamp joiningData) {
        this.userID = userID;
        this.userName = userName;
        this.userImage = userImage;
        this.active = active;
        this.joiningData = joiningData;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Timestamp getJoiningData() {
        return joiningData;
    }

    public void setJoiningData(Timestamp joiningData) {
        this.joiningData = joiningData;
    }
}
