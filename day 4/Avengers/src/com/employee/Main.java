package com.employee;

public class Main {

    public static void main(String[] args) {

        Avenger[] employees = new Avenger[5];

        employees[0] = new Avenger();
        employees[1] = new Avenger();
        employees[2] = new Avenger();
        employees[3] = new Avenger();
        employees[4] = new Avenger();

//       create object and get details
        for(int i=0; i<5; i++){
            employees[i] = new Avenger();
            employees[i].getDetails();
        }


//        print details
        for(int i=0; i<5; i++){
            System.out.println("***** avenger " + (i+1) + " *****");
            employees[i].displayDetails();
        }


    }
}
