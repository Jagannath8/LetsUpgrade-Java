package com.quizapp;

import java.util.Scanner;

public class Player {
    Scanner sc = new Scanner(System.in);
    String name;
    int score = 0;

    public void getDetails(){

        System.out.println("");
        System.out.println("***** " + "INSTRUCTIONS" + " *****");
        System.out.println("You will be awarded +10 for each correct answer and -5 for each wrong answer! ");
        System.out.println("----- " + "GOOD LUCK" + " -----");
        System.out.println("");

        System.out.println("Enter player name");
        name = sc.next();

    }

}