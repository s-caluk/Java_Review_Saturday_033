package week11_review.constructor_static.restaurant_task;


import java.util.ArrayList;

/**
 * This class represents a restaurant. It has an owner, a location, a number of stars, and lists of servers and chefs.
 *
 * @author Your Name
 */
public class Restaurant {

    /**
     * The owner of the restaurant.
     */
    public String owner;

    /**
     * The location of the restaurant.
     */
    public String location;

    /**
     * The number of stars the restaurant has.
     */
    public int numberOfStars;

    /**
     * The list of servers at the restaurant.
     */
    public ArrayList<Server> servers;

    /**
     * The list of chefs at the restaurant.
     */
    public ArrayList<Chef> chefs;

    /**
     * Creates a new restaurant with the given owner, location, and number of stars.
     *
     * @param owner the owner of the restaurant
     * @param location the location of the restaurant
     * @param numberOfStars the number of stars the restaurant has
     */
    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
        this.servers = new ArrayList<>();
        this.chefs = new ArrayList<>();
    }

    /**
     * Adds a server to the restaurant.
     *
     * @param server the server to add
     */
    public void hireServer(Server server) {
        if (server == null) {
            throw new IllegalArgumentException("Server cannot be null");
        }
        servers.add(server);
    }

    /**
     * Adds an array of servers to the restaurant.
     *
     * @param servers the servers to add
     */
    public void hireServer(Server[] servers) {
        for (Server server : servers) {
            hireServer(server);
        }
    }

    /**
     * Adds a chef to the restaurant.
     *
     * @param chef the chef to add
     */
    public void hireChef(Chef chef) {
        if (chef == null) {
            throw new IllegalArgumentException("Chef cannot be null");
        }
        chefs.add(chef);
    }

    /**
     * Adds an array of chefs to the restaurant.
     *
     * @param chefs the chefs to add
     */
    public void hireChef(Chef[] chefs) {
        for (Chef chef : chefs) {
            hireChef(chef);
        }
    }

    /**
     * Removes a chef from the restaurant.
     *
     * @param employeeID the ID of the chef to remove
     */
    public void terminateChef(int employeeID) {
        for (Chef chef : chefs) {
            if (chef.employeeID == employeeID) {
                chefs.remove(chef);
                break;
            }
        }
    }

    /**
     * Removes a server from the restaurant.
     *
     * @param employeeID the ID of the server to remove
     */
    public void terminateServer(int employeeID) {
        for (Server server : servers) {
            if (server.employeeID == employeeID) {
                servers.remove(server);
                break;
            }
        }
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }

}