import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0;
        double fuel = 0;
        double price = 0;
        double cost = 0;
        double miles = 0;
        String trash;
        System.out.println("Enter the number of gallons in the tank:");
        System.out.println("Enter the fuel in miles per gallon:");
        System.out.println("Enter the price of gas per gallon:");

        if (in.hasNextDouble()) {
            gallons = in.nextDouble();
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value " + trash);
            System.out.println("Run the program again and enter a correct value");
            System.exit(0);
        }
        if (in.hasNextDouble()) {
            fuel = in.nextDouble();
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value " + trash);
            System.out.println("Run the program again and enter a correct value");
            System.exit(0);
        }
        if (in.hasNextDouble()) {
            price = in.nextDouble();
        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value  " + trash);
            System.out.println("Run the program again and enter a correct value");
            System.exit(0);
        }
        //Calculate cost to drive 100 miles
        cost = (100 / fuel) * price;

        //Calculate the distance of the car
        miles = gallons * fuel;

        System.out.println("The cost per 100 miles is: $ " + cost);
        System.out.println("The car can travel: " + miles + " miles");
    }
}
