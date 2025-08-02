import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random  rand = new Random();
        int numberToGuess = 78; // Fixed line
        int attempts = 0;
        int guess;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);
    }
}