package com.example.nbaumgartner.roadtrip.models;

/**
 * Created by nbaumgartner on 4/20/2016.
 */
public class Player {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Player(String _name,int _score){
        this.name = _name;
        this.score = _score;
    }

    public void increaseScore(int amount){
        this.score = score + amount;
    }

    public void decreaseScore(int amount){
        this.score = score - amount;
    }


}
