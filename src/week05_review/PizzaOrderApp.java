package week05_review;
//nesnelerin degerlerinin müsteriden istenmis hali
import java.util.Scanner;

public class PizzaOrderApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1:
        System.out.println("\tWelcome to Cydeo Pizza House\n\nWould you like to order a pizza? (Yes/No)");
        String answer = input.nextLine().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {  //  !(valid) ===> invalid
            System.err.println("Invalid entry, Please re-enter! Would you like to order a pizza? (Yes/No)");
            answer = input.nextLine().toLowerCase();
        } // Making sure that user will enter either yes or no

        if (answer.equals("no")) { // if the user does not want to order a pizza
            System.err.println("Thanks for using our service!");
            return; // exits the main method
        }


        // Step 2:
        System.out.println("Enter the size of the pizza (small, medium, large):");
        String size = input.next().toLowerCase();

        input.nextLine();

        while (!(size.equals("small") || size.equals("medium") || size.equals("large"))) {  // while the entry for size is invalid
            System.err.println("Invalid entry, please re-enter the size of pizza (small, medium, large):");
            size = input.nextLine().toLowerCase();
        } // Making sure that user will enter either small, medium, or large


        // Step 3:
        System.out.println("Enter the number of cheese toppings (0 - 10):");
        int cheeseTopping = input.nextInt();

        while (cheeseTopping < 0 || cheeseTopping > 10) {
            System.err.println("Invalid entry, please re-enter the number of cheese toppings (0 - 10):");
            cheeseTopping = input.nextInt();
        } // Making sure that user will enter the numbers between 1 ~ 10 for cheese toppings


        System.out.println("Enter the number of pepperoni toppings (0 - 20):");
        int pepperoniTopping = input.nextInt();

        while (pepperoniTopping < 0 || pepperoniTopping > 20) {
            System.err.println("Invalid entry, please re-enter the number of pepperoni toppings (0 - 20):");
            pepperoniTopping = input.nextInt();
        } // Making sure that user will enter the numbers between 1 ~ 20 for pepperoni toppings


        // Step 4:
        System.out.println("Enter the quantity (1 - 100):");
        int quantity = input.nextInt();

        while (quantity <= 0 || quantity > 100) {
            System.err.println("Invalid entry, please re-enter the quantity (1 - 100):");
            quantity = input.nextInt();
        } // Making sure that user will enter the numbers between 1 ~ 100 for quantity


        // Step 5:
        Pizza pizza = new Pizza();
        pizza.setInfo(size, quantity, cheeseTopping, pepperoniTopping);
        // setting the user inputs to the pizza object's attributes

        System.out.println("Your total cost is: $" + pizza.calcCost());


        /*
         Optional challenge:
            Before displaying the total price, ask the user if they want to add another order.
                If user enters "yes", start over from step #2
                If user enters "no", display the total cost
         */

        input.close();

    }
}

/*
Create a class named `PizzaOrderApp` and write a program for pizza ordering applications with the following requirements:

    1. Display the following welcome message and ask the user if they want to order a pizza:

                    Welcome to Cydeo Pizza House

                Would you like to order a pizza?

            If they say "yes," proceed to the next step.

            If they say "no," display "Thanks for using our service!".

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

    2. Ask the user to select the size of the pizza. If the user enters an invalid entry, then the application should ask the user to re-enter until the user provides a valid entry.

    3. Ask the user to enter the number of cheese toppings and pepperoni toppings. If any entry is invalid, then the application should ask the user to re-enter until the user provides a valid entry.

    4. Ask the user to enter the quantity.

    5. The application should create the pizza object for the pizza that the user ordered and display the total price at the end.

 */