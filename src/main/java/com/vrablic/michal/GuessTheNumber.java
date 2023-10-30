package com.vrablic.michal;

import java.util.Scanner;

public class GuessTheNumber {
    private static final int computer_number = (int) (Math.random() * (100 - 1));

    public static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);

        int user_number;
        int try_number = 0;
        do {
            System.out.println("Guess the number");
            user_number = scanner.nextInt();
            try_number++;
            if (user_number < computer_number) {
                System.out.println("The number is larger than: " + user_number);
            } else if (user_number > computer_number) {
                System.out.println("The number is smaller than: " + user_number);
            }
        }while (user_number != computer_number);
        System.out.println("You guessed the number: " + user_number + " in " + try_number + " guesses");

    }
}
