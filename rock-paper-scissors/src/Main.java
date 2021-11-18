import java.util.Scanner;

public class Main {

    public static boolean over = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to play?");
        String random = sc.nextLine();
        System.out.println("Okay, let's go!");
        play();
    }

    public static void play() {
        Scanner sc = new Scanner(System.in);
        int compNum = (int) Math.floor(Math.random() * 3);
        String[] choices = {"rock", "paper", "scissors"};
        System.out.println("1) rock 2) paper 3) scissors");
        int num =0;
        try {
            num = sc.nextInt() - 1;
        } catch (Exception ignore) {
            System.out.println("Please choose from 1, 2, or 3. \n");
            play();
        }
        if (!(num >= 0 && num <= 2)) {
            System.out.println("Please choose from 1, 2, or 3. \n");
            play();
        } else if (!over) {
            System.out.println("The computer chose " + choices[compNum] + ". You chose " + choices[num] + ".");
            if (compNum == num) {
                System.out.println("It's a draw!");
                over = true;
            } else if ((compNum + 1) % 3 == (num % 3)) {
                System.out.println("You win!");
                over = true;
            } else {
                System.out.println("You lose!");
                over = true;
            }
        }
    }
}
