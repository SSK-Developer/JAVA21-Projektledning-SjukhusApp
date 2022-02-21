package com.Sahlgrenska1;
import java.util.Locale;
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

        System.out.println("Vänligen logga in med namn och lösenord nedan: ");
        System.out.println("Namn: ");
        String usernNameLogIn = sc.nextLine().toLowerCase().trim();
        System.out.println("Lösenord: ");
        String userPassLogIn = sc.nextLine().toLowerCase().trim();


        System.out.println(s1.logInCheck(usernNameLogIn,userPassLogIn));

        //print all employees
        System.out.println(s1.getEmployees());

        //Add patient to once specific employee
        s1.addSahlgrenskaPatient("usernNameLogIn", "userPassLogIn", "Alex", 10);

        //Print patients for a specific employee
        System.out.println(s1.getPatients("usernNameLogIn","userPassLogIn"));

        //ta bort en patient
        s1.removePatient("usernNameLogIn", "userPassLogIn", 1);



    }
}
