import java.util.Random;
import java.util.Scanner;

public class Numbergame {
  public static int generateRandomNumber(int min, int max) {
    Random rand = new Random();
    return rand.nextInt((max - min) + 1) + min;
  }

  public static int playRound(int rnum, int attLimit) {
    Scanner sc = new Scanner(System.in);
    int att = 1;

    while (att <= attLimit) {
      System.out.println("Attempt " + att + ": Enter your guess:");
      int unum = sc.nextInt();

      if (unum == rnum) {
        System.out.println("Correct guess!");
        return att; // Return the attempts made
      } else if (unum < rnum) {
        System.out.println("Too low. Try again.");
      } else {
        System.out.println("Too high. Try again.");
      }

      att++;
    }

    System.out.println("Attempts limit reached. The correct number was: " + rnum);
    return att; // Return the attempts made
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int minRange = 1;
    int maxRange = 100;
    int attLimit = 5;
    int totalAttempts = 0;
    int totalRounds = 0;

    int playAgain = 1;
    while (playAgain == 1) {
      int rnum = generateRandomNumber(minRange, maxRange);
      System.out.println("New round started! Guess the number between " + minRange + " and " + maxRange);

      int att = playRound(rnum, attLimit);
      totalAttempts += att;
      totalRounds++;

      System.out.println("Do you want to play again? Press 1 for yes, 0 for no:");
      playAgain = sc.nextInt();
    }

    System.out.println("Game Over. Total Rounds: " + totalRounds + ", Total Attempts: " + totalAttempts);
  }
}
