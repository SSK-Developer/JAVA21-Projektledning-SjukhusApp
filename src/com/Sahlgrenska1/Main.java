package com.Sahlgrenska1;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void runApp(){
        Scanner sc = new Scanner(System.in);
        Sahlgrenska s1 = new Sahlgrenska();

        System.out.println("Vänligen logga in med namn och lösenord nedan: ");
        System.out.println("Namn: ");
        String usernNameLogIn = sc.nextLine().toLowerCase().trim();
        System.out.println("Lösenord: ");
        String userPassLogIn = sc.nextLine().toLowerCase().trim();


        System.out.println("dawdas");

        System.out.println(s1.logInCheck(usernNameLogIn,userPassLogIn));

        //Add employees
        s1.addEmployee(new Employees("safer","safer123",50000,50,"kirurg"));
        s1.addEmployee(new Employees("noah","noah123",50000,50,"kirurg"));
        s1.addEmployee(new Employees("hamood","hamood123",50000,50,"kirurg"));
        s1.addEmployee(new Employees("william","william123",50000,50,"kirurg"));



        System.out.println("Press (0) to print menu \n" +
                "Press (1) to print employees \n" +
                "Press (2) to print your patients. \n" +
                "Press (3) to add patient. \n" +
                "Press (4) to remove patient. \n" +
                "Press (5) to book a room \n" +
                "Press (6) to add drugs to a specific room \n" +
                "Press (7) to add equipment to a specific room \n" +
                "Press (8) to quit." );

        boolean quit = false;
        while(!quit) {


            switch (sc.nextInt()) {
                case 0 :
                    System.out.println("Press (0) to print menu \n" +
                            "Press (1) to print employees \n" +
                            "Press (2) to print your patients. \n" +
                            "Press (3) to add patient. \n" +
                            "Press (4) to remove patient. \n" +
                            "Press (5) to book a room \n" +
                            "Press (6) to add drugs to a specific room \n" +
                            "Press (7) to add equipment to a specific room \n" +
                            "Press (8) to quit." );
                    break;
                case 1 :
                    System.out.println(s1.getEmployees());
                    break;
                default:
                    System.out.println("fel input");
            }
        }
    }

    public static void main(String[] args) {
    runApp();

        /*Scanner sc = new Scanner(System.in);
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
        s1.addSahlgrenskaPatient(usernNameLogIn, userPassLogIn, "Alex", 10);
        s1.addSahlgrenskaPatient(usernNameLogIn, userPassLogIn, "Albin", 8);


        //Print patients for a specific employee
        System.out.println(s1.getPatients(usernNameLogIn,userPassLogIn));


        //ta bort en patient
        s1.removePatient(usernNameLogIn, userPassLogIn, 1);

        //Print patients for a specific employee
        System.out.println(s1.getPatients(usernNameLogIn,userPassLogIn));*/

    }
}
