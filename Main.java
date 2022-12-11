import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // create a new scanner object to read user input
    Scanner input = new Scanner(System.in);

    // prompt the user to enter their name
    System.out.print("Enter your name: ");
    String name = input.nextLine();

    // welcome the user and start the game
    System.out.println("Welcome, " + name + "! Let's play a game.");

    // randomly generate a number between 1 and 100
    int number = (int) (Math.random() * 100 + 1);

    // initialize the number of guesses the user has made
    int guesses = 0;

    // initialize a boolean flag to track if the user has won the game
    boolean hasWon = false;

    // keep looping until the user wins or runs out of guesses
    while (guesses < 10 && !hasWon) {
      // prompt the user to guess a number
      System.out.print("Guess a number between 1 and 100: ");
      int guess = input.nextInt();

      // increment the number of guesses the user has made
      guesses++;

      // check if the user's guess is correct
      if (guess == number) {
        // the user has won!
        hasWon = true;
        System.out.println("Congratulations, you won in " + guesses + " guesses!");
      } else if (guess < number) {
        // the user's guess is too low
        System.out.println("Your guess is too low. Try again.");
      } else {
        // the user's guess is too high
        System.out.println("Your guess is too high. Try again.");
      }
    }

    // the user ran out of guesses and did not win
    if (!hasWon) {
      System.out.println("Sorry, you ran out of guesses. The correct number was " + number + ".");
    }

    // close the scanner object to avoid memory leaks
    input.close();
  }
}
