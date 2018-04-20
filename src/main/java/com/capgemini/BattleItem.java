package com.capgemini;

public class BattleItem {
    private String itemName;
    private int drive;
    private int training;

    public BattleItem(String itemName, int drive, int training)
    {
        this.itemName=itemName;
        this.drive=drive;
        this.training=training;
    }

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
