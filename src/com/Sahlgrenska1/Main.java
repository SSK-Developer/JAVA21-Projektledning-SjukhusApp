package com.Sahlgrenska1;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void runApp() throws IOException {
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

        //Creating test patient
        s1.addSahlgrenskaPatient(usernNameLogIn,userPassLogIn,"Albin", 2);
        s1.addSahlgrenskaPatient(usernNameLogIn,userPassLogIn,"Emil", 4);

        //Creating rooms.
        s1.createRoom("1", "Floor 1");
        s1.createRoom("2", "Floor 3");
        s1.createRoom("3", "Floor 3");



        System.out.println("Press (0) to print menu \n" +
                "Press (1) to print employees \n" +
                "Press (2) to print all of your patients \n" +
                "Press (3) to add patient. \n" +
                "Press (4) to remove patient. \n" +
                "Press (5) to print a specific patient \n"  +
                "Press (6) to book a room \n" +
                "Press (7) to add drugs to a specific room \n" +
                "Press (8) to add equipment to a specific room \n" +
                "Press (9) to print all rooms \n" +
                "Press (10) to quit." );

        boolean quit = false;
        while(!quit) {


            switch (sc.nextInt()) {
                case 0 :
                    System.out.println("Press (0) to print menu \n" +
                            "Press (1) to print employees \n" +
                            "Press (2) to print all of your patients \n" +
                            "Press (3) to add patient. \n" +
                            "Press (4) to remove patient. \n" +
                            "Press (5) to print a specific patient \n"  +
                            "Press (6) to book a room \n" +
                            "Press (7) to add drugs to a specific room \n" +
                            "Press (8) to add equipment to a specific room \n" +
                            "Press (9) to print all rooms \n" +
                            "Press (10) to quit." );
                    break;
                case 1 :
                {
                    System.out.println(s1.getEmployees());
                    break;
                }
                case 2 :
                {
                    s1.printAllPatients(usernNameLogIn,userPassLogIn);
                    break;
                }

                case 3:{
                    System.out.println("Enter patient name");
                    String pName = sc.next();
                    System.out.println("Enter patients condition from 0-10");
                    int pCondition = sc.nextInt();
                    s1.addSahlgrenskaPatient(usernNameLogIn,userPassLogIn, pName, pCondition);
                    break;
                }

                case 4:
                {
                    System.out.println("Enter patients name to remove.");
                    String pName = sc.next();
                    s1.removePatient(usernNameLogIn,userPassLogIn,pName);
                    break;

                }

                case 5:{
                    System.out.println("Enter patient name");
                    String pName = sc.next();
                    System.out.println(s1.findPatient(usernNameLogIn,userPassLogIn,pName));
                    break;
                }

                case 6:{
                    System.out.println("Enter room name.");
                    String roomName = sc.next();
                    System.out.println("Enter patient name");
                    String pName = sc.next();
                    s1.bookRoom(usernNameLogIn,userPassLogIn,pName,roomName);
                    break;
                }

                case 7:{
                    System.out.println("Enter room name.");
                    String roomName = sc.next();
                    System.out.println("Enter name of drug.");
                    String drugName = sc.next();
                    System.out.println("Enter Description of drug.");
                    String drugDesc = sc.next();
                    System.out.println("Enter quantity of drug.");
                    int drugQuant = sc.nextInt();
                    s1.addDrugsToRoom(drugName,drugDesc,drugQuant,roomName);
                    break;
                }

                case 8:{
                    System.out.println("Enter room name.");
                    String roomName = sc.next();
                    System.out.println("Enter name of equipment.");
                    String equipName = sc.next();
                    System.out.println("Enter Description of equipment.");
                    String equipDesc = sc.next();
                    System.out.println("Enter quantity of drug.");
                    int equipQuant = sc.nextInt();
                    s1.addEquipmentToRoom(equipName,equipDesc,equipQuant,roomName);
                    break;
                }

                case 9 :{
                    s1.printAllRooms();
                    break;
                }

                case 10 :{
                    System.out.println("Quitting app......");
                    quit = true;
                }

                default:
                    System.out.println("fel input");
            }
        }
    }

    public static void main(String[] args) throws IOException {
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


        //Print patients.txt for a specific employee
        System.out.println(s1.getPatients(usernNameLogIn,userPassLogIn));


        //ta bort en patient
        s1.removePatient(usernNameLogIn, userPassLogIn, 1);

        //Print patients.txt for a specific employee
        System.out.println(s1.getPatients(usernNameLogIn,userPassLogIn));*/

    }
}
