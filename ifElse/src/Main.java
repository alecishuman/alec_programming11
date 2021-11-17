import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Assignment 1: \n");
        int people = 30;
        int cars = 40;
        int buses = 15;


        if ( cars > people )
        {
            System.out.println( "We should take the cars." );
        }
        else if ( cars < people )
        {
            System.out.println( "We should not take the cars." );
        }
        else
        {
            System.out.println( "We can't decide." );
        }


        if ( buses > cars )
        {
            System.out.println( "That's too many buses." );
        }
        else if ( buses < cars )
        {
            System.out.println( "Maybe we could take the buses." );
        }
        else
        {
            System.out.println( "We still can't decide." );
        }


        if ( people > buses )
        {
            System.out.println( "All right, let's just take the buses." );
        }
        else
        {
            System.out.println( "Fine, let's stay home then.\n\n" );
        }

        System.out.println("1. It goes through different conditions to determine whether or not we should take the car, bus, or stay home." +
                "The if else statements are comparing the different variables to print out the statements. \n" +
                "2. If I remove the first else-if statement, it won't affect anything with the given variables. However, if the variables are" +
                "changed so that cars < people, then it would print out 'We can't decide' instead of 'We should not take the car'.");

        System.out.println("Assignment 2: \n");
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting)");
        String name = sc.nextLine();
        System.out.print("Ok, " + name + ", how old are you?");
        int age = sc.nextInt();
        if (age < 16) {
            System.out.println("You can't drive. \n\n");
        } else if (age == 16 || age == 17) {
            System.out.println("You can drive, but you can't vote. \n\n");
        } else if (18 <= age && age <= 24) {
            System.out.println("You can vote but not rent a car. \n\n");
        } else if (age >= 25) {
            System.out.println("You can do pretty much anything. \n\n");
        }
        System.out.println("Assignment 3: \n");
        System.out.print("Please enter your current weight: ");
        int weight = sc.nextInt();
        System.out.println("I have information for the following planets:");
        System.out.println("\t1. Venus    2. Mars    3. Jupiter");
        System.out.println("\t4. Saturn   5. Uranus  6. Neptune");
        System.out.print("Which planet are you visiting?");
        int planet = sc.nextInt();
        double newWeight = 0;
        switch (planet) {
            case 1:
                newWeight = weight * 0.78;
                break;
            case 2:
                newWeight = weight * 0.39;
                break;
            case 3:
                newWeight = weight * 2.65;
                break;
            case 4:
                newWeight = weight * 1.17;
                break;
            case 5:
                newWeight = weight * 1.05;
                break;
            case 6:
                newWeight = weight * 1.23;
                break;
        }
        System.out.println("\nYour weight would be " + newWeight + " pounds on that planet \n\n");
        System.out.println("Assignment 4: \n");
        System.out.print("Are you ready for a quiz?");
        String whatever = sc.nextLine();
        System.out.println("Okay, here it comes!\n");
        System.out.println("Q1) Where is Jupiter?");
        System.out.println("\t 1) Outside of Milkyway");
        System.out.println("\t 2) Somewhere in our solar system");
        System.out.println("\t 3) Atlantic Ocean");
        System.out.println("\t 4} In Vancouver");
        int answer1 = sc.nextInt();
        if (answer1 == 2) {
            System.out.println("That's right! \n");
        } else {
            System.out.println("Sorry, that is incorrect. \n");
        }
        System.out.println("Q2) Do you like games?");
        System.out.println("\t 1) Yes");
        System.out.println("\t 2) No");
        int answer2 = sc.nextInt();
        if (answer2 == 1) {
            System.out.println("Good. You better. \n");
        } else {
            System.out.println("How dare you? Have you been living under a hole? Go play some right now!!! \n");
        }
        System.out.println("Q3) When did WW2 begin?");
        System.out.println("\t 1) 1914");
        System.out.println("\t 2) 1945");
        System.out.println("\t 3) 1939");
        int answer3 = sc.nextInt();
        if (answer3 == 3) {
            System.out.println("That's right! \n");
        } else {
            System.out.println("Sorry, that is incorrect. \n");
        }
    }
}
