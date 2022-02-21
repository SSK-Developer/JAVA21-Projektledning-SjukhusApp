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


    public Room(Patients patient, String name, String department, List<Drugs> drugs, List<Equipment> equipments) {
        this.patient = patient;
        this.name = name;
        this.department = department;
        drugs = new ArrayList<>();
        equipments = new ArrayList<>();
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
}
