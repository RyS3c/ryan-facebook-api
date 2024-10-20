package com.example.facebook_api.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.util.UUID;

@Table(schema = "Reactions")
public class Reaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID reactID;

    private int likes;
    private int heart;
    private int sad;
    private int care;
    private int funny;

    public Reaction() {
        super();
    }

    public Reaction(UUID reactID, int likes, int heart, int sad, int care, int funny) {
        this.reactID = reactID;
        this.likes = likes;
        this.heart = heart;
        this.sad = sad;
        this.care = care;
        this.funny = funny;
    }

    public UUID getReactID() {
        return reactID;
    }

    public void setReactID(UUID reactID) {
        this.reactID = reactID;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public int getSad() {
        return sad;
    }

    public void setSad(int sad) {
        this.sad = sad;
    }

    public int getCare() {
        return care;
    }

    public void setCare(int care) {
        this.care = care;
    }

    public int getFunny() {
        return funny;
    }

    public void setFunny(int funny) {
        this.funny = funny;
    }
}
