package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lower = 1;
        int upper = 100;
        int number = random.nextInt(upper - lower + 1) + lower;

        int attempts = 0;
        int maxAttempts = 7;
        boolean guessed = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == number) {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
                guessed = true;
                break;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (!guessed) {
            System.out.println("❌ You used all attempts.");
            System.out.println("The correct number was: " + number);
        }

        sc.close();
    }
}
