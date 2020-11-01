package com.employees;

import java.util.Scanner;

public class Employee {

        Scanner scan = new Scanner(System.in);
        public String name;
        public int age;
        public double salary;
        public String designation;

        public void getDetails(){
            System.out.println("Enter the name: ");
            name = scan.nextLine();
            System.out.println("Enter the age: ");
            age = scan.nextInt();
            System.out.println("Enter the salary(in Rupees): ");
            salary = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter the designation: ");
            designation = scan.nextLine();

        }

        public void displayDetails(){
            System.out.println("The name of employee is " + name  + ", age is " + age
                                + ", salary is Rs " + salary + " and designation is " + designation);

        }
    }
