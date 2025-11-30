package com.abdullahih.example2;

import com.abdullahih.example2.model.CsGo;

public class MainClass {
    public static void main(String[] args) {
        CsGo csGo1 = new CsGo("101","kalam");
//        csGo1.playerScore++;
//        csGo1.playerScore++;
//        csGo1.playerScore++;
        csGo1.addKillCount();
        csGo1.addKillCount();
        csGo1.addKillCount();

        csGo1.printStatus();
        CsGo csGo2 = new CsGo("103","Rajim" );
//        csGo2.playerScore = 1000;
        csGo2.addKillCount();
        csGo2.printStatus();
    }
}

