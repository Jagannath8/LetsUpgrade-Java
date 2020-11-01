package com.employees;

public class Main {

    public static void main(String[] args) {

//        ---------------------------------------------------------------------------------------------------------

//        Question 1

//        Employee e1 = new Employee();
//        Employee e2 = new Employee();
//
//        e1.getDetails();
//        e1.displayDetails();
//
//        e2.getDetails();
//        e2.displayDetails();


//        ----------------------------------------------------------------------------------------------------------

//        Question 2,3,4

        Doctor[] doctors = new Doctor[3];
        Engineer[] engineers = new Engineer[3];
        Pilot[] pilots = new Pilot[3];



        for(int i=0; i<1; i++) {
            doctors[i] = new Doctor();
            engineers[i] = new Engineer();
            pilots[i] = new Pilot();
        }


//        print details
        for(int i=0; i<1; i++){
            doctors[i].Education();
            doctors[i].Treatment();
            doctors[i].Medicine();
            engineers[i].Education();
            engineers[i].Work();
            engineers[i].Projects();
            pilots[i].Education();
            pilots[i].Plane();
            pilots[i].Routes();
        }




    }
}
