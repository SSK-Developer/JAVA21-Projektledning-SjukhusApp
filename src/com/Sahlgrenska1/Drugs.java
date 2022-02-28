package com.Sahlgrenska1;

public class Drugs {

    //Constructor
    public Drugs(String name, String descriptions, int numOfAvailable) {
        this.name = name;
        this.descriptions = descriptions;
        this.numOfAvailable = numOfAvailable;
    }

    //states
    String name;
    String descriptions;
    int numOfAvailable;

    //getters&setters
    public String getName() {
        return name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public int getNumOfAvailable() {
        return numOfAvailable;
    }
    public void setNumOfAvailable(int numOfAvailable) {
        this.numOfAvailable = numOfAvailable;
    }

    @Override
    public String toString() {
        return "Drugs{" +
                "name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", numOfAvailable=" + numOfAvailable +
                '}';
    }
}
