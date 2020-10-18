package com.employee;

import java.util.Scanner;

public class Avenger {

    Scanner scan = new Scanner(System.in);
    public String name;
    public int age;
    public String power;
    public String weapon;
    public String planet;


    public void getDetails(){
        System.out.println("Enter the name ");
        name = scan.nextLine();
        System.out.println("Enter the age ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter power ");
        power = scan.nextLine();
        System.out.println("Enter the weapon ");
        weapon = scan.nextLine();
        System.out.println("Enter planet ");
        planet = scan.nextLine();


    }

    public void displayDetails(){
        System.out.println("The name is " + name);
        System.out.println("The age is " + age);
        System.out.println("Power is " + power);
        System.out.println("Weapon is " + weapon);
        System.out.println("Planet is " + planet);
        System.out.println();


    }
}

