import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static boolean over = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to play?");
        String random = sc.nextLine();
        System.out.println("Okay, let's go!");
        while (!over) {
            play();
            System.out.println("Do you want to play again? yes or no");
            playAgain();
        }

    }

    public static void play() {
        Scanner sc = new Scanner(System.in);
        int compNum = (int) Math.floor(Math.random() * 3);
        String[] choices = {"rock", "paper", "scissors"};
        System.out.println("1) rock 2) paper 3) scissors");
        int num = -1;
        try {
            num = sc.nextInt() - 1;
        } catch (Exception ignore) {
        }
        if (!(num >= 0 && num <= 2)) {
            System.out.println("Please choose from 1, 2, or 3. \n");
            play();
        } else {
            System.out.println("The computer chose " + choices[compNum] + ". You chose " + choices[num] + ".");
            if (compNum == num) {
                System.out.println("It's a draw!");
            } else if ((compNum + 1) % 3 == (num % 3)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
    }

    public static void playAgain() {
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (!Objects.equals(answer, "yes") && !Objects.equals(answer, "no")) {
            System.out.println("Please choose yes or no. \n");
            playAgain();
        } else if (answer.equals("no")) {
            over = true;
        }
    }
}
