package com.Sahlgrenska1;

import java.util.ArrayList;
import java.util.List;

public class Room {

    //States
    Patients patient;
    String name;
    String department;
    List<Drugs> drugs;
    List<Equipment> equipments;

    //Constructor


    public Room(String name, String department) {
        this.name = name;
        this.department = department;
        drugs = new ArrayList<>();
        equipments = new ArrayList<>();
    }

    public void addDrugs(String name, String descriptions, int numOfAvailable){
        Drugs drug = new Drugs(name,descriptions,numOfAvailable);
        drugs.add(drug);
        System.out.println("Drug " + drug.getName() + " has been added successfully");
    }

    public void addEquipments(String name, String descriptions, int numOfAvailable){
        Equipment equipment = new Equipment(name,descriptions,numOfAvailable);
        equipments.add(equipment);
        System.out.println("Equipment " + equipment.getName() + " has been added successfully");
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }




    public Patients getPatient() {
        return patient;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<Drugs> getDrugs() {
        return drugs;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    @Override
    public String toString() {
        try{
            return "Room{" +
                    "patient=" + patient.getName() +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", drugs=" + drugs +
                    ", equipments=" + equipments +
                    '}';
        }catch (NullPointerException e){
            return "Room{" +
                    "patient=" + patient +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", drugs=" + drugs +
                    ", equipments=" + equipments +
                    '}';
        }

    }
}
