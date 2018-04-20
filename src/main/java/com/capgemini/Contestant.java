package com.capgemini;

import java.util.Random;

    //abstract class
public abstract class Contestant {

    //initializing necessary variables
    private boolean isAlive=true;
    private int contestantId;
    private int health;
    private Gender gender;
    private int attackLevel;
    private int defenceLevel;
    private BattleItem battleItem;

    //creating a constructor
    public Contestant(int contestantId, int health, Gender gender, int attackLevel, int defenceLevel, BattleItem battleItem) {
        this.contestantId=contestantId;
        this.health = health;
        this.gender = gender;
        this.attackLevel = attackLevel;
        this.defenceLevel = defenceLevel;
        this.battleItem=battleItem;

    }

    //not used method for now
    public void isContestantAlive()
    {
        if(health>0)
        {
            isAlive=true;
        }
        else
        {
            isAlive=false;
        }
    }

    //getters and setters necessary to be able to access private variables from other classes

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    public BattleItem getBattleItem() {
        return battleItem;
    }

    public void setBattleItem(BattleItem battleItem) {
        this.battleItem = battleItem;
    }

    public int getContestantId() {
        return contestantId;
    }

    public void setContestantId(int contestantId) {
        this.contestantId = contestantId;
    }
}
