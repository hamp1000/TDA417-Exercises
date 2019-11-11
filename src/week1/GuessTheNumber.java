package week1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int upperBound = 10000;
    private int lowerBound = 0;

    private Scanner scanner;
    private Random random;

    public GuessTheNumber() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void startGame() {
        System.out.println("Welcome to Guess The Number!");
        System.out.println("I am going to try to guess what number you are thing of.");
        System.out.println("If I am correct you type 'C' if i guessed to high you type 'H' and to low 'L'.");

        guess();
    }

    private void guess() {

        if (upperBound -lowerBound < 0 || upperBound == lowerBound) {
            System.out.println("You are not thinking of any number");
            return;
        }

        int nrGuess = random.nextInt(upperBound - lowerBound) + lowerBound;

        System.out.println("is your number (C, H, L): " + nrGuess);
        input(nrGuess);
    }

    private void input(int nrGuess) {
        String answer =  scanner.nextLine();

        switch (answer) {
            case "C":
                endGame();
                break;
            case "H":
                upperBound = nrGuess-1;
                guess();
                break;
            case "L":
                lowerBound = nrGuess+1;
                guess();
                break;
            default:
                System.out.println("invalid input");
                input(nrGuess);
                break;
        }

    }

    private void endGame() {
        System.out.println("Yes! Thanks for playing!");
    }

}
