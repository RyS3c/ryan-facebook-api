package com.example.facebook_api.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.sql.Timestamp;
import java.util.UUID;

@Table(schema = "Status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID statusID;

    private String userID;
    private String statusImageURL;
    private Timestamp uploadTime;

    public Status() {}

    public Status(UUID statusID, String userID, String statusImageURL, Timestamp uploadTime) {
        this.statusID = statusID;
        this.userID = userID;
        this.statusImageURL = statusImageURL;
        this.uploadTime = uploadTime;
    }

    public UUID getStatusID() {
        return statusID;
    }

    public void setStatusID(UUID statusID) {
        this.statusID = statusID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getStatusImageURL() {
        return statusImageURL;
    }

    public void setStatusImageURL(String statusImageURL) {
        this.statusImageURL = statusImageURL;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }
}
