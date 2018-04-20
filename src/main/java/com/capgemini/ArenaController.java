package com.capgemini;

import java.util.Random;

public class ArenaController {
    private String contestantType;
    Contestant[] listOfContestants;

    public ArenaController(String contestantType, Contestant[] listOfContestants) {
        this.contestantType = contestantType;
        this.listOfContestants = listOfContestants;
    }

    Contestant[] districtPlayersMales = new District[9];
    Contestant[] districtPlayersFemales = new District[9];
    Contestant[] careerPlayers = new Career[3];


    Random random = new Random();

    public void generateDistrictPlayers() {
        BattleItem banana = new BattleItem("Banana", 10, 5);


        int arrayLength = districtPlayersMales.length;
        int arrayLength2 = districtPlayersFemales.length;

        for (int i = 0; i < arrayLength; i++) {
            int counter = random.nextInt(100) + 1;
            int healthRandom = random.nextInt(100) + 1;
            int attackRandom = random.nextInt(100) + 1;
            int defenseRandom = random.nextInt(100) + 1;
            this.districtPlayersMales[i] = new District(counter, healthRandom, Gender.MALE, attackRandom, defenseRandom, banana);
        }
        for (int i = 0; i < arrayLength2; i++) {
            int counter = random.nextInt(100) + 1;
            int healthRandom = random.nextInt(100) + 1;
            int attackRandom = random.nextInt(100) + 1;
            int defenseRandom = random.nextInt(100) + 1;
            this.districtPlayersFemales[i] = new District(counter, healthRandom, Gender.FEMALE, attackRandom, defenseRandom, banana);
        }
    }
    public String getContestantType() {
        return contestantType;
    }

    public void setContestantType(String contestantType) {
        this.contestantType = contestantType;
    }
}
