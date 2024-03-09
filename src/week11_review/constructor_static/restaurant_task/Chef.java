package week11_review.constructor_static.restaurant_task;

/**
 * This class represents a chef in a restaurant.
 *
 * @author <NAME>
 *
 */
public class Chef {

    /**
     * The name of the chef.
     */
    private String name;

    /**
     * The employee ID of the chef.
     */
    int employeeID;

    /**
     * The hourly rate of the chef.
     */
    private double hourlyRate;

    /**
     * Whether the chef is a full-time or part-time employee.
     */
    private boolean fullTime;

    /**
     * Creates a new chef with the specified details.
     *
     * @param name the name of the chef
     * @param employeeID the employee ID of the chef
     * @param hourlyRate the hourly rate of the chef
     * @param fullTime whether the chef is a full-time or part-time employee
     */
    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    /**
     * Makes an order for the restaurant.
     */
    public void makeOrder() {
        System.out.println(name + " is making an order");
    }

    /**
     * Washes the dishes in the restaurant.
     */
    public void washDishes() {
        System.out.println(name + " is washing the dishes");
    }

    /**
     * Returns a string representation of the chef.
     *
     * @return a string representation of the chef
     */
    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }

}
/*
Create a custom class named Chef with the following specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

	Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status

 */
