package com.example.nbaumgartner.roadtrip.models;

import java.util.ArrayList;

/**
 * Created by nbaumgartner on 4/20/2016.
 */

public class YellowCarGame {
    private ArrayList<Player> players = new ArrayList<>();

    public  ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers( ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player playerToAdd){
        this.players.add(playerToAdd);
    }

    public boolean removePlayer(Player playerToRemove){
        if(this.players.contains(playerToRemove)) {
            this.players.remove(playerToRemove);
            return true;
        }
        else{
         return false;
        }

    }



}
