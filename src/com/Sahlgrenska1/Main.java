package com.Sahlgrenska1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sahlgrenska s1 = new Sahlgrenska();

        //Add employees
        s1.addEmployee(new Employees("safer","safer123",50000,50,"kirurg","null"));
        s1.addEmployee(new Employees("noah","noah123",50000,50,"kirurg","null"));
        s1.addEmployee(new Employees("hamood","hamood123",50000,50,"kirurg","null"));
        s1.addEmployee(new Employees("william","william123",50000,50,"kirurg","null"));

        //print all employees
        System.out.println(s1.getEmployees());

        //Add patient to once specific employee
        s1.addSahlgrenskaPatient("safer", "safer123", "Alex", 10);

        //Print patients for a specific employee
        System.out.println(s1.getPatients("safer","safer123"));

        //ta bort en patient
        s1.removePatient("safer", "safer123", 1);

    }
}
