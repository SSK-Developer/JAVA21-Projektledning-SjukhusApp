package com.Sahlgrenska1;

import java.util.ArrayList;
import java.util.List;


public class Sahlgrenska {


    public Sahlgrenska(){
        employees = new ArrayList<>();
    }

    private List<Employees> employees;

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

    public void addSahlgrenskaPatient(String name, String password, String patientName, int condition){
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

    public void removePatient(String name, String password, int index){
        for(var item: employees){
            if(name.equals(item.getName()) && password.equals(item.getPassword())){
                item.removePatient1(index-1);
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
