import java.util.Objects;
import java.util.Scanner;

public class Main {

//    Check if the user doesn't want to play anymore
    public static boolean over = false;
    public static int win = 0;
    public static int loss = 0;
    public static int draw = 0;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Random intro to program
        System.out.print("Do you want to play?");
        String random = sc.nextLine();
        System.out.println("Okay, let's go!");
//        Start loop
        while (!over) {
            play();
            System.out.println("Do you want to play again? yes or no");
            playAgain();
        }

    }
// Function to play the game
    public static void play() {
        Scanner sc = new Scanner(System.in);
//        Randomly choose computer value
        int compNum = (int) Math.floor(Math.random() * 3);
        String[] choices = {"rock", "paper", "scissors"};
//        Asks for user's choice
        System.out.println("1) rock 2) paper 3) scissors");
        int num = -1;
//        Catch incorrect input types and makes the user try again
        try {
            num = sc.nextInt() - 1;
        } catch (Exception ignore) {
        }
        if (!(num >= 0 && num <= 2)) {
//            Catch incorrect numbers and makes the user try again
            System.out.println("Please choose from 1, 2, or 3. \n");
            play();
        } else {
//            Output result
            System.out.println("The computer chose " + choices[compNum] + ". You chose " + choices[num] + ".");
            if (compNum == num) {
                System.out.println("It's a draw!");
                draw += 1;
            } else if ((compNum + 1) % 3 == (num % 3)) {
                System.out.println("You win!");
                win += 1;
            } else {
                System.out.println("You lose!");
                loss += 1;
            }
            System.out.println("Wins: " + win + "  Draws: " + draw + "  Losses:" + loss + "\n");
        }
    }
// Asks user to play again
    public static void playAgain() {
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
//        Check for correct answer choice
        if (!Objects.equals(answer, "yes") && !Objects.equals(answer, "no")) {
            System.out.println("Please choose yes or no. \n");
            playAgain();
        } else if (answer.equals("no")) {
//          Ends program if the user doesn't want to play again.
            over = true;
        }
    }
}