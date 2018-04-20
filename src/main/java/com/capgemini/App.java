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
        Contestant firstPerson = new District(10,10,Gender.MALE,10,4,banana);
        Contestant secondPerson = new District(11,15, Gender.FEMALE,5,10,banana);
        Contestant[] listOfThem = {firstPerson, secondPerson};
        ArenaController listOfContestants = new ArenaController("District",listOfThem);
        listOfContestants.generateDistrictPlayers();
        System.out.println("End point");
        
    }


}
