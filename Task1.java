import java.util.Scanner;
import java.util.Random;

public class Task1{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    String playerMove, computerMove = "";
    int computerInt;

    System.out.println("Enter your move! (Rock, Paper, Scissors)");
    playerMove = scan.next();
    playerMove = playerMove.toLowerCase();

    computerInt = random.nextInt(3) + 1;

    if (computerInt == 1) {
      computerMove = "rock";
    } else if (computerInt == 2) {
      computerMove = "paper";
    } else if (computerInt == 3) {
      computerMove = "scissors";
    }

    System.out.println("Computer chose " + computerMove);

    if (playerMove.equals(computerMove)) {
      System.out.println("It's a tie!");
    } else if (playerMove.equals("rock")) {
      if (computerMove.equals("scissors")) {
        System.out.println("You win!");
      } else if (computerMove.equals("paper")) {
        System.out.println("Computer wins!");
      }
    } else if (playerMove.equals("paper")) {
      if (computerMove.equals("rock")) {
        System.out.println("You win!");
      } else if (computerMove.equals("scissors")) {
        System.out.println("Computer wins!");
      }
    } else if (playerMove.equals("scissors")) {
      if (computerMove.equals("paper")) {
        System.out.println("You win!");
      } else if (computerMove.equals("rock")) {
        System.out.println("Computer wins!");
      }
    } else {
      System.out.println("Invalid input. Try again.");
    }
  }
}
