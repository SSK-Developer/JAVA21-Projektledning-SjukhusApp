package com.Sahlgrenska1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sahlgrenska {


    public Sahlgrenska(){
        employees = new ArrayList<>();
        rooms = new ArrayList<>();
    }

    private List<Employees> employees;
    private List<Room> rooms;

    public void addEmployee(Employees employee){
        employees.add(employee);
    }

    public List<String> getEmployees(){
        List<String> allEmployees = new ArrayList<>();
        for (var item: employees){
            allEmployees.add(item.getName());
        }
        return allEmployees;
    }

    public void createRoom(String name, String department){
        Room room = new Room(name, department);
        rooms.add(room);
    }

    public Room findRoom(String roomName){
        for(Room r : rooms){
            if(r.getName().equals(roomName)){
                return r;
            }
        }
        return null;
    }

    public void bookRoom(String name, String password, String patientName,String roomName) {
        for (var item : employees) {
            if (name.equals(item.getName()) && password.equals(item.getPassword())) {
                item.findPatient(patientName).setRoom(findRoom(roomName));
                findRoom(roomName).setPatient(findPatient(name,password,patientName));
                System.out.println("Room has successfully been booked.");
            }
        }
    }





    public void printAllRooms(){
        for(Room r : rooms){
            System.out.println(r);
        }
    }

    public void addEquipmentToRoom(String name, String descriptions, int numOfAvailable,String roomName){
        findRoom(roomName).addEquipments(name,descriptions,numOfAvailable);
    }
    public void addDrugsToRoom(String name, String descriptions, int numOfAvailable,String roomName){
        findRoom(roomName).addDrugs(name,descriptions,numOfAvailable);
    }

    public void addSahlgrenskaPatient(String name, String password, String patientName, int condition) throws IOException {
        for( var item :employees){
            if (name.equals(item.getName()) && password.equals(item.getPassword())){
                item.addPatient(new Patients(patientName,condition));
            }
        }
    }



    public List<String> getPatients(String name, String password){
        List<String>patients = new ArrayList<>();
        for (var item :employees){
            if (name.equals(item.getName()) && password.equals(item.getPassword())){
                patients.add("Patient(s): " + item.getEmployeePatients());
            }
        }
        return patients;
    }

    public void printAllPatients(String name, String password) {
        for (var item : employees) {
            if (name.equals(item.getName()) && password.equals(item.getPassword())) {
                for (Patients p : item.getPatientsList()) {
                    System.out.println(p.getName());
                }
            }
        }
    }


    public Patients findPatient(String userName, String password, String name){
        for(var item : employees){
            if(item.getName().equals(userName) && item.getPassword().equals(password)){
                return item.findPatient(name);
            }
        }
        return null;
    }




    public void removePatient(String name, String password, String pName){
        for(var item: employees){
            if(name.equals(item.getName()) && password.equals(item.getPassword())){
                item.removePatient1(item.getPatientsIndexByName(pName));
                System.out.println("Patient has been removed.");
            }
        }
    }


    public boolean logInCheck(String name, String password){
        for (var item:employees){
            if(name.equals(item.getName()) && password.equals(item.getPassword())){
                return true;
            }
        }
        return false;
    }
}
