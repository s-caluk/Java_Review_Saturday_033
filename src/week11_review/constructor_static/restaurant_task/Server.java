package week11_review.constructor_static.restaurant_task;


/**
 * This class represents a server in a restaurant.
 *
 * @author <NAME>
 * @version 1.0
 */
public class Server {

    /**
     * The name of the server.
     */
    public String name;

    /**
     * The employee ID of the server.
     */
    public int employeeID;

    /**
     * The hourly rate of the server.
     */
    public double hourlyRate;

    /**
     * Whether the server is full-time or part-time.
     */
    public boolean fullTime;

    /**
     * Creates a new Server with the specified details.
     *
     * @param name       the name of the server
     * @param employeeID the employee ID of the server
     * @param hourlyRate the hourly rate of the server
     * @param fullTime   whether the server is full-time or part-time
     */
    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    /**
     * Takes an order from a customer.
     */
    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    /**
     * Cleans a table after a customer leaves.
     */
    public void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }

    /**
     * Returns a string representation of the Server.
     */
    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }

}
