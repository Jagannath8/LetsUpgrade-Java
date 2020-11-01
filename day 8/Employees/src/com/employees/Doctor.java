package com.employees;

public class Doctor implements Employee2 {

    public void Education() {
        System.out.println("Doctor must complete MBBS degree.");
    }

    public void Treatment() {
        System.out.println("Doctor checks the patient.");
    }

    public void Medicine() {
        System.out.println("Doctor prescribes medicines to the patients.");
    }

}
