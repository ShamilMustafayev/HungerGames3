package com.capgemini;

public class ArenaController {
    private String contestantType;
    Contestant[] listOfContestants;

    public ArenaController(String contestantType, Contestant[] listOfContestants) {
        this.contestantType = contestantType;
        this.listOfContestants = listOfContestants;
    }
}
