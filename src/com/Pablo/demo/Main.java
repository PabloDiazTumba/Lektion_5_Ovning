package com.Pablo.demo;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student benny = new Student();

        do {

            System.out.println("Input benny's age!");
            int result = sc.nextInt();

            benny.age = result;

            System.out.println("You picked:" + result);
            System.out.println("Benny's age is: " + benny.age);

        }while (true);
    }
}