package com.Sahlgrenska1;

public class Patients {
    final String name;
    int condition;
    Room room;

    public Patients(String name, int condition) {
        this.name = name;
        this.condition = condition;
    }

    public Patients(String name, int condition, Room room) {
        this.name = name;
        this.condition = condition;
        this.room = room;
    }


    public String getName() {
        return name;
    }

    public int getCondition() {
        return condition;
    }

    public Room getRoom() {
        return room;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "name='" + name + '\'' +
                ", condition=" + condition +
                ", room=" + room +
                '}';
    }
}
