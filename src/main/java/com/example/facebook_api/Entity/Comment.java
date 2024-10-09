package com.example.facebook_api.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.sql.Timestamp;
import java.util.UUID;

@Table(schema = "Comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID commentID;
    private String userID;

    private String userImage;
    private String userName;
    private String comment;

    private Timestamp timestamp;

    public Comment() {
        super();
    }

    public Comment(UUID commentID, String userID, String userImage, String userName, String comment, Timestamp timestamp) {
        this.commentID = commentID;
        this.userID = userID;
        this.userImage = userImage;
        this.userName = userName;
        this.comment = comment;
        this.timestamp = timestamp;
    }

    public UUID getCommentID() {
        return commentID;
    }

    public void setCommentID(UUID commentID) {
        this.commentID = commentID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
