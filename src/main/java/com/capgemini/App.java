package com.capgemini;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
        //testing hello world
        System.out.println("Hello World!");

        //creating new ArenaController object
        ArenaController listOfDistrictContestants = new ArenaController("District");

        //calling a function from ArenaController to generate players
        listOfDistrictContestants.generatePlayers();

        //testing just ending
        System.out.println("Test");


    }


}
