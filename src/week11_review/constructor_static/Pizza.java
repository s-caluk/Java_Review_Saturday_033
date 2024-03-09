package week11_review.constructor_static;

/**
 * This class represents a Pizza that can be ordered.
 * It contains information about the size, quantity, number of cheese and pepperoni toppings, and the cost of the pizza.
 */
public class Pizza {

    /**
     * The size of the pizza. Can be "small", "medium", or "large".
     */
    public String size;

    /**
     * The quantity of pizzas to order.
     */
    public int quantity;

    /**
     * The number of cheese toppings on the pizza.
     */
    public int numberOfCheeseTopping;

    /**
     * The number of pepperoni toppings on the pizza.
     */
    public int numberOfPepperoniTopping;

    /**
     * Creates a new Pizza with the specified size, quantity, cheese topping, and pepperoni topping.
     *
     * @param size The size of the pizza.
     * @param quantity The quantity of pizzas to order.
     * @param numberOfCheeseTopping The number of cheese toppings on the pizza.
     * @param numberOfPepperoniTopping The number of pepperoni toppings on the pizza.
     */
    public Pizza(String size, int quantity, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.quantity = quantity;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    /**
     * Calculates the cost of the pizza based on the size, quantity, cheese topping, and pepperoni topping.
     *
     * @return The cost of the pizza.
     */
    public double calcCost() {
        double totalCost = 0;

        double startingPrice = (size.equalsIgnoreCase("small"))? 10
                :(size.equalsIgnoreCase("medium"))? 14 : 16;

        double toppings = (numberOfCheeseTopping * 0.8) + (numberOfPepperoniTopping * 1.5);

        totalCost = (startingPrice + toppings) * quantity;

        return totalCost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", quantity=" + quantity +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }
}
