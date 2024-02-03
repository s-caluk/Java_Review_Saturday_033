package week06_review;

public class VariablePractice {
    public static void main(String[] args) {

        final String DATE_OF_BIRTH = "June/02/1085";

        String fullName = "John Johnson"; // lowerCamel case
        int buildingNumber = 23456;
        String streetName = "Potomac Drive";
        String city = "Chantilly";
        String state = "FL";
        int zipCode = 340123;

        System.out.println("Your Shipping address is:\n\t\t" + fullName + "\n\t\t" + buildingNumber + " " +streetName);
        System.out.println("\t\t" + city + ", " + state + " " + zipCode);


    }
}
/*
4. Create a class named ShippingAddress and write a program with the following requirements:

	Declare the following variables with appropriate data types:
 			fullName
			buildingNumber
			streetName
			city
			state
			zipCode

	Use concatenation to print the full shipping address

			Example:
				fullName = "Aaron Kissinger";
				buildingNumber = 13621;
				streetName = "Legacy Circle"
				city = "Fairfax;
				state = "VA";
				zipCode = 22030;

			Output:
	      		Your Shipping address is:
                			Aaron Kissinger
                			13621 Legacy Circle
                			Fairfax, VA 22030
 */
