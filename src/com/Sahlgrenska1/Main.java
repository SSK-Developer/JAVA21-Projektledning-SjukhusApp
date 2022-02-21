package com.Sahlgrenska1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employees e1 = new Employees("safer","safer123",50000,50,"kirurg","null");
        Employees e2 = new Employees("noah","noah123",50000,50,"kirurg","null");
        Employees e3 = new Employees("hamood","hamood123",50000,50,"kirurg","null");
        Employees e4 = new Employees("william","william123",50000,50,"kirurg","null");



        System.out.println("Välkommen, vänligen fyll i inloggningsuppgifter nedan: ");
        System.out.println("Namn: ");
        String userLogInName = sc.nextLine();
        System.out.println("Lösenord: ");
        String userLogInPass = sc.nextLine();

    }
}
