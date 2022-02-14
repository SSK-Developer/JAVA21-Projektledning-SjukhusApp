package com.Sahlgrenska1;

public class Room {

    //Constructor
    public Room(String name, String department, String equipment, String size, String patient ,int hours) {
        this.name = name;
        this.department = department;
        this.equipment = equipment;
        this.size = size;
        this.hours = hours;
        this.patient = patient;
    }

    //States
    String patient;
    String name;
    String department;
    String equipment;
    String size;
    int hours;

    //Getters&Setters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getEquipment() {
        return equipment;
    }

    public String getSize() {
        return size;
    }

    public String getPatient(){
        return patient;
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){
        this.hours = hours;
    }
}
