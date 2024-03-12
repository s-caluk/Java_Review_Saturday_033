package week11_review.encapsulation;

public class Item {
    private String name;
    private int unitPrice;
    private int quantity;

    public Item(String name, int unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty or blank");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name cannot contain any special characters other than space");
        }

        if (!name.matches("[a-zA-Z][a-zA-Z]+")) {
            throw new IllegalArgumentException("Name must start with letters");
        }
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice < 0) {
            throw new IllegalArgumentException("Unit price cannot be negative");
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }


    public double calcCost() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total= $" + calcCost() +
                '}';
    }

}

/*
3. Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */
