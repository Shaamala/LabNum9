/*
Abduljabbar Shaamala
Lab Number 9
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grand Circus Motors admin console!");

        // create list to hold cars information
        ArrayList<Car> inventory = new ArrayList<>();


        System.out.print(" How many car are you entering: ");
        System.out.print("");
        int input = scan.nextInt(); // number of cars
        int i = 1; //counter
        while (i <= input) {

            System.out.print("Please enter Car #" + i + " make: ");
            String make = scan.next();
            System.out.print("Please enter Car #" + i + " model: ");
            String model = scan.next();
            System.out.print("Please enter Car #" + i + " year: ");
            int year = scan.nextInt();
            System.out.print("Please enter Car #" + i + " price: ");
            double price = scan.nextDouble();

            i++;

            // assign object as list input
            inventory.add(new Car(make, model, year, price));

        }
        System.out.println("");
        System.out.println("Current Inventory: ");
        // loop to print out the list
        for (Car car : inventory) {

            System.out.println(car);
        }

    }
}

