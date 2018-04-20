package com.capgemini;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //testing hello world
        System.out.println("Hello World!");

        //creating new ArenaController object
//        ArenaController listOfDistrictContestants = new ArenaController("District");
//        listOfDistrictContestants.generatePlayers();
//

        ArenaController joinEverything = new ArenaController("Joining");
        joinEverything.generatePlayers();
        joinEverything.joinAll(joinEverything.districtPlayersMales, joinEverything.careerPlayersFemales, joinEverything.districtPlayersFemales, joinEverything.careerPlayersMales);

        joinEverything.requestAlivePlayers();

        //testing just ending
        System.out.println("Test");

        //I know it is stupid, but did not have time to implement it in a Game Controller. Just showing how could two players fight. Did not have time for "for" loop as well :(
        joinEverything.allPlayers[0].getHealth();
        joinEverything.allPlayers[1].getHealth();
        if (joinEverything.allPlayers[0].getAttackLevel() > joinEverything.allPlayers[1].getDefenceLevel()) {
            System.out.println("The player " + joinEverything.allPlayers[1].getContestantId() + " is dead.");
        }
    }
}
