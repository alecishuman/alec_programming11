public class Main {
    public static void main(String[] args) {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car.\n\n" );

        int room = 113;
        double e = 2.71828;
        String subject = "Computer Science";
        System.out.println("This is room # " + room);
        System.out.println("e is close to " + e);
        System.out.println("I am learning a bit about " + subject);

        String[][] courses = {
                {"English 11", "Ms. McGhee"}, 
                {"French 11", "Mr. Matthews"}, 
                {"AP Chemistry 12", "Mr. Slapsys"},
                {"Computer Information Systems 12", "Mr. Zaremba"}, 
                {"AP Microeconomics 12", "Ms. Sodhi"},
                {"AP Physics 12", "Mr. Tang"},
                {"Social Studies 11", "Mr. Alves"}, 
                {"Pre-AP Biology 11", "Mr. Wilkie"}};
        System.out.print("\n\n+");
        for (int i = 0; i < 57; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("| " + (i+1) + " |" + addSpaces(courses[i][0].length(), 35) + courses[i][0] + " |" +
                    addSpaces(courses[i][1].length(), 15) + courses[i][1] + " |");
        }
        System.out.print("+");
        for (int i = 0; i < 57; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }

    public static String addSpaces(int num, int max) {
        String spaces = "";
        for (int i = 0; i < max - num; i++) {
            spaces += " ";
        }
        return spaces;
    };
}


