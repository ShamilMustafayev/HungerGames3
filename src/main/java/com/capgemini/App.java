package com.capgemini;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        BattleItem banana = new BattleItem("Banan", 10,5);
        Contestant firstPerson = new District(false,10,Gender.MALE,10,4,banana);

        Contestant[] listOfThem = {firstPerson};
        ArenaController listOfContestants = new ArenaController("District",listOfThem);
    }
}
