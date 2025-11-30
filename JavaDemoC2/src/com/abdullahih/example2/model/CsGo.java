package com.abdullahih.example2.model;

import java.security.PublicKey;

public class CsGo {
    private String id;
    private String playerName;
//    public Integer playerScore;
    private Integer playerScore;
    private Integer startTimeScore = 0;
    private Integer endTimeScore = 0;

    public CsGo(String id, String playerName) {
        this.id = id;
        this.playerName = playerName;
        this.playerScore = startTimeScore;
    }

    public void addKillCount(){
        this.playerScore++;
    }
    public void printStatus()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Player Name: "+playerName);
        System.out.println("Player Score: "+playerScore);
    }

}
