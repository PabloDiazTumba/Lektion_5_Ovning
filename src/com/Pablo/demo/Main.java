package com.Pablo.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String playerName = sc.nextLine();
        System.out.println("Welcome player #1: " + playerName);

        int x;
        while (true) {
            System.out.println("Please enter a number: ");

            if (sc.hasNextInt()) {
                x = sc.nextInt();
                break;
            } else {
                System.out.println("That's not a number mate! Please enter a number.");
                sc.next();
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.println(i);
            System.out.println("Looping...");
        }

        boolean isPlaying = true;

        do {
            String userInput = scannerText();

            switch (userInput) {
                case "Stop":
                    isPlaying = false;
                    break;
                case "1":
                    System.out.println("Throwing!");
                    break;
                default:
                    System.out.println("Wrong input");
            }

        } while (isPlaying);

    }

    public static String scannerText() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please press 1, or write 'Stop' to stop playing ");
        String input = sc.nextLine();

        return input;
    }
}