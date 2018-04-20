package com.capgemini;

import java.util.Random;

public class ArenaController {
    private String contestantType;

    public ArenaController(String contestantType) {
        this.contestantType = contestantType;
    }

    Contestant[] districtPlayersMales = new District[9];
    Contestant[] districtPlayersFemales = new District[9];
    Contestant[] careerPlayersMales = new Career[3];
    Contestant[] careerPlayersFemales = new Career[3];


    Random random = new Random();

    public void generatePlayers() {
        BattleItem banana = new BattleItem("Banana", 10, 5);


        int arrayLength = districtPlayersMales.length;
        int arrayLength2 = districtPlayersFemales.length;
        int arrayLength3 = careerPlayersMales.length;
        int arrayLength4 = careerPlayersFemales.length;


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

        for (int i = 0; i < arrayLength3; i++) {
            int counter = random.nextInt(100) + 1;
            int healthRandom = random.nextInt(100) + 1;
            int attackRandom = random.nextInt(100) + 1;
            int defenseRandom = random.nextInt(100) + 1;
            this.careerPlayersMales[i] = new Career(counter, healthRandom, Gender.MALE, attackRandom, defenseRandom, banana);
        }
        for (int i = 0; i < arrayLength4; i++) {
            int counter = random.nextInt(100) + 1;
            int healthRandom = random.nextInt(100) + 1;
            int attackRandom = random.nextInt(100) + 1;
            int defenseRandom = random.nextInt(100) + 1;
            this.careerPlayersFemales[i] = new Career(counter, healthRandom, Gender.FEMALE, attackRandom, defenseRandom, banana);
        }
    }

    public String getContestantType() {
        return contestantType;
    }

    public void setContestantType(String contestantType) {
        this.contestantType = contestantType;
    }
}
