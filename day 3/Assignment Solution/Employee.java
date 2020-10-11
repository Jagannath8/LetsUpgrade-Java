
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentYear = 2020; 

        String name;
        System.out.println("Enter name ");
        name = sc.nextLine();

        int dateOfBirth;
        System.out.println("Enter date of birth ");
        dateOfBirth = sc.nextInt();

        int monthOfBirth;
        System.out.println("Enter month of birth ");
        monthOfBirth = sc.nextInt();

        int birthYear;
        System.out.println("Enter birth year ");
        birthYear = sc.nextInt();

        int monthlySalary;
        System.out.println("Enter monthly salary ");
        monthlySalary = sc.nextInt();


        System.out.println("Name of employee is " + name);
        System.out.println("DOB is " + dateOfBirth + "/" + monthOfBirth + "/" + birthYear);

        if(birthYear <= currentYear) {
            System.out.println("Age is " + (currentYear-birthYear));
        }
        else{
            System.out.println("You entered wrong birth year!");
        }
        

        int annualSalary;
        annualSalary = monthlySalary * 12;
        System.out.println("Annual salary is " + annualSalary);


        int tax1=20;
        int taxAmount1 = (tax1 * annualSalary) / 100;

        int tax2=15;
        int taxAmount2 = (tax2 * annualSalary) / 100;

        int tax3=10;
        int taxAmount3 = (tax3 * annualSalary) / 100;;

        int tax4=5;
        int taxAmount4 = (tax4 * annualSalary) / 100;; 


        if (annualSalary > 500000) {
            System.out.println("Tax amount " + taxAmount1);
        }

         else if (annualSalary < 500000 && annualSalary >= 400000) {
            System.out.println("Tax amount " + taxAmount2);
        }
       

        else if (annualSalary < 400000 && annualSalary >= 300000) {
            System.out.println("Tax amount " + taxAmount3);
        }

        else if (annualSalary < 300000 && annualSalary >= 200000) {
            System.out.println("Tax amount " + taxAmount4);
        }

        else {
            System.out.println(" No Tax amount to be paid ");
        }

    }
}

