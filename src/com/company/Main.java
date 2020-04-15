package com.company;

import java.util.Scanner;

public class Main extends GoodStudent {
    public Main(String name, String surname) {
        super(name, surname);
    }

    public static void main(String[] args) {
        GoodStudent student1 = new GoodStudent("Damir", "Kadyrov");
        System.out.println("Enter the student's salary:");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        student1.setSalary(a);
        System.out.println("The name of the student: " + student1.getName() + ". " + "The surname: " + student1.getSurname()+ ". " + "The overall income is: " + student1.calc());

    }
}
