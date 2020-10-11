
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float marks1;
        System.out.println("Enter marks in Maths");
        marks1 = sc.nextFloat();

        float marks2;
        System.out.println("Enter marks in Physics");
        marks2 = sc.nextFloat();

        float marks3;
        System.out.println("Enter marks in Chemistry");
        marks3 = sc.nextFloat();

        float marks4;
        System.out.println("Enter marks in IT");
        marks4 = sc.nextFloat();

        float marks5;
        System.out.println("Enter marks in Biology");
        marks5 = sc.nextFloat();

        float sum;
        sum = marks1 + marks2 + marks3 + marks4 + marks5;


        float percentage;
        percentage = (sum/500)*100;

        System.out.println("Percentage is " + percentage);


        if (percentage >= 70 && percentage <= 100) {
            System.out.println("You have A grade");
        }

        else if (percentage >= 50 && percentage < 70) {
            System.out.println("You have B grade");
        }

        else if (percentage >= 35 && percentage <= 49) {
            System.out.println("You have C grade");
        }

        else {
            System.out.println("You are failed! Please study, dont play!");
        }

    }
}
