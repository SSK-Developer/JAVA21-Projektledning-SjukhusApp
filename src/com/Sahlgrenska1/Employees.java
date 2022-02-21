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
    private List<Patients> patientsList;

    public Employees(String name, String password, int salary, int hours, String speciality, String patients) {
        this.name = name;
        this.password = password;
        this.salary = salary;
        this.hours = hours;
        this.speciality = speciality;
        this.patients = patients;
        patientsList = new ArrayList<>();
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
    }

    public List<String> getEmployeePatients(){
        List<String>patients = new ArrayList<>();
        for (var item: patientsList){
            patients.add(String.valueOf(item.getName()));
            patients.add(String.valueOf(item.getCondition()));
            //patients.add(item.getRoom());
        }
        return patients;
    }

    public void removePatient1(int index){
        patientsList.remove(index-1);
    }

}
