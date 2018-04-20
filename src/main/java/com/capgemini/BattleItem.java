package com.capgemini;

//simple battle item class that will be used later

public class BattleItem {
    private String itemName;
    private int drive;
    private int training;

    //a constructor necessary for defining battle item
    public BattleItem(String itemName, int drive, int training)
    {
        this.itemName=itemName;
        this.drive=drive;
        this.training=training;
    }

    //getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }

    public int getTraining() {
        return training;
    }

    public void setTraining(int training) {
        this.training = training;
    }
}
