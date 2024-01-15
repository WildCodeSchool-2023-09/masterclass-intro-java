package com.example.demo;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        String secret;
        System.out.println("Choose the secret word :");

        Scanner scanner = new Scanner(System.in);
        secret = scanner.next();

        int remainingTries = 8;
        String guessed = "";

        char[] secretLetters = new char[secret.length()];

        for (int i = 0; i < secret.length(); i++) {
            secretLetters[i] = '_';
        }

        while (!guessed.equals(secret)) {
            System.out.println("Remaining tries : " + remainingTries);
            System.out.println("Pick a letter : ");

            String userInput = scanner.next();

            char letter = userInput.charAt(0);

            if (!Character.isLetter(letter)) {
                System.out.println("❌ - Please select a correct letter");
                continue;
            }

            if (secret.contains(String.valueOf(letter))) {
                for (int i = 0; i < secret.length(); i++) {
                    if (secret.charAt(i) == letter) {
                        secretLetters[i] = letter;
                    }
                }
                System.out.println(secretLetters);
            } else {
                System.out.println(secretLetters);
                displayHangman(remainingTries);
                remainingTries--;
            }

            if (secret.equals(new String(secretLetters))) {
                System.out.println("Good job ! You found it ! 🎉");
                break;
            }

            if (remainingTries == 0) {
                System.out.println("😱 - Game over !");
                break;
            }

        }
        scanner.close();

    }

    static void displayHangman(int remainingTries) {
        // Simple hangman drawing based on attempts left
        switch (remainingTries) {
            case 8:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 7:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|");
                System.out.println("|");
                break;
            case 6:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|      |");
                System.out.println("|");
                break;
            case 5:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|");
                break;
            case 4:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|     /");
                break;
            case 3:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|     / \\");
                break;
            case 2:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|     / \\");
                System.out.println("|    /");
                break;
            case 1:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|     / \\");
                System.out.println("|    /   \\");
                break;
            case 0:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|     \\O/");
                System.out.println("|      |");
                System.out.println("|     / \\");
                System.out.println("|    /   \\");
                break;
            default:
                break;
        }
    }

}
