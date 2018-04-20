package com.capgemini;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        BattleItem banana = new BattleItem("Banana", 10,5);

        ArenaController listOfDistrictContestants = new ArenaController("District");

        listOfDistrictContestants.generatePlayers();
        System.out.println("Test");


    }


}
