package com.capgemini;

import java.util.Random;

public class ArenaController {
    private String contestantType;


    //creating a constructor with a simple name
    public ArenaController(String contestantType) {
        this.contestantType = contestantType;
    }

    //creating 4 types of contestants, 2 district-male and female, 2 career - male and female
    Contestant[] districtPlayersMales = new District[9];
    Contestant[] districtPlayersFemales = new District[9];
    Contestant[] careerPlayersMales = new Career[3];
    Contestant[] careerPlayersFemales = new Career[3];
    Contestant[] allPlayers;


    //creating random objector
    Random random = new Random();

    //creating a function/method to generate Players with 1 Battle Item
    public void generatePlayers() {

        BattleItem banana = new BattleItem("Banana", 10, 5);

        //getting the legth of an array
        int arrayLength = districtPlayersMales.length;
        int arrayLength2 = districtPlayersFemales.length;
        int arrayLength3 = careerPlayersMales.length;
        int arrayLength4 = careerPlayersFemales.length;

        //setting up a loop to generate the list of Males Contestants with District Type
        for (int i = 0; i < arrayLength; i++) {

            //generating random values necessary for assigning
            int counter = random.nextInt(100) + 1;
            int healthRandom = random.nextInt(100) + 1;
            int attackRandom = random.nextInt(100) + 1;
            int defenseRandom = random.nextInt(100) + 1;

            //assigning generated values to appropriate fields
            this.districtPlayersMales[i] = new District(counter, healthRandom, Gender.MALE, attackRandom, defenseRandom, banana);
        }

        //setting up a loop to generate the list of Females Contestants with District Type
        for (int i = 0; i < arrayLength2; i++) {
            int counter = random.nextInt(100) + 1;
            int healthRandom = random.nextInt(100) + 1;
            int attackRandom = random.nextInt(100) + 1;
            int defenseRandom = random.nextInt(100) + 1;
            this.districtPlayersFemales[i] = new District(counter, healthRandom, Gender.FEMALE, attackRandom, defenseRandom, banana);
        }

        //setting up a loop to generate the list of Males Contestants with Career Type
        for (int i = 0; i < arrayLength3; i++) {
            int counter = random.nextInt(100) + 1;
            int healthRandom = random.nextInt(100) + 1;
            int attackRandom = random.nextInt(100) + 1;
            int defenseRandom = random.nextInt(100) + 1;
            this.careerPlayersMales[i] = new Career(counter, healthRandom, Gender.MALE, attackRandom, defenseRandom, banana);
        }

        //setting up a loop to generate the list of Female Contestants with Career Type
        for (int i = 0; i < arrayLength4; i++) {
            int counter = random.nextInt(100) + 1;
            int healthRandom = random.nextInt(100) + 1;
            int attackRandom = random.nextInt(100) + 1;
            int defenseRandom = random.nextInt(100) + 1;
            this.careerPlayersFemales[i] = new Career(counter, healthRandom, Gender.FEMALE, attackRandom, defenseRandom, banana);
        }
    }

    //bruteforce way of joining the lists
    public void joinAll(Contestant[] join1, Contestant[] join2, Contestant[] join3, Contestant[] join4) {
        Contestant[] newList = new Contestant[25];
        for (int i = 0; i < join1.length; i++) {
            newList[i] = join1[i];
        }
        for (int i = 0; i < join2.length; i++) {
            newList[i + join1.length] = join2[i];
        }
        for (int i = 0; i < join3.length; i++) {
            newList[i + join1.length + join2.length] = join3[i];
        }
        for (int i = 0; i < join4.length; i++) {
            newList[i + join1.length + join2.length + join3.length] = join4[i];
        }
        this.allPlayers = newList;
    }

    //declaring a method that would check alive players
    public void requestAlivePlayers() {
        int arrayLength = allPlayers.length-1;
        for (int i = 0; i < arrayLength; i++) {
            if (allPlayers[i].getHealth() > 0) {
                //using the casting method so that we can access the People Plane's methods, and of course saving in a temp
                System.out.println("The ID of alive player is: " + allPlayers[i].getContestantId());
            } else {
                System.out.println("Sorry no alive players found :(");
            }
        }
    }
}
