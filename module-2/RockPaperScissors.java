
/* Steve Stylin 
Programming with Java
Module 2.2
*/ 


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer's choice (1: Rock, 2: Paper, 3: Scissors)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user for their choice
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");
        int userChoice = scanner.nextInt();

        // Display choices
        System.out.println("Computer's choice: " + choiceToString(computerChoice));
        System.out.println("Your choice: " + choiceToString(userChoice));

        // Determine the winner
        String result = determineWinner(userChoice, computerChoice);
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to convert choice number to string
    private static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }

    // Method to determine the winner
    private static String determineWinner(int user, int computer) {
        if (user == computer) {
            return "It's a tie!";
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
