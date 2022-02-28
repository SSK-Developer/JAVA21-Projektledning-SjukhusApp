package com.Sahlgrenska1;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    String name;
    String password;
    int salary;
    int hours;
    String speciality;
    String patients;
    private List<Patients> patientsList = new ArrayList<>();

    public Employees(String name, String password, int salary, int hours, String speciality) {
        this.name = name;
        this.password = password;
        this.salary = salary;
        this.hours = hours;
        this.speciality = speciality;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPatients() {
        return patients;
    }

    public void setPatients(String patients) {
        this.patients = patients;
    }

    public void addPatient(Patients patient){
        patientsList.add(patient);
        System.out.println("Patient : " + patient.getName() + " successfully added.");
    }

    public Patients findPatient(String name){
        for(var item :patientsList){
            if(item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }


    public int getPatientsIndexByName(String name){
        for(int i = 0; i<patientsList.size(); i++){
            if(patientsList.get(i).getName().equals(name)){
                System.out.println("Patient found.");
                return i;
            }
        }
        return -1;
    }

    public List<Patients> getPatientsList() {
        return patientsList;
    }

    public List<String> getEmployeePatients(){
        List<String>patients = new ArrayList<>();
        for (var item: patientsList){
            patients.add(String.valueOf(item.getName()));
            patients.add(String.valueOf(item.getCondition()));
            //patients.txt.add(item.getRoom());
        }
        return patients;
    }

    public void removePatient1(int index){
        patientsList.remove(index);
    }

}
