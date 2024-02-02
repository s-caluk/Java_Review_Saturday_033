package week02_review;

public class EmailGenerator {
    public static void main(String[] args) {

        String firstName = "Daria";
        int birthYear = 1985;

        /*
        System.out.println( firstName + "_" + birthYear + "@yahoo.com");
        System.out.println( firstName + "_" + birthYear + "@gmail.com");
        System.out.println( firstName + "_" + birthYear + "@outlook.com");
         */

        String emailPattern = firstName + "_" + birthYear;

        String yahoo = emailPattern + "@yahoo.com"; // it's combining first name with underscore and birth year and @yahoo.com"
        String gmail = emailPattern + "@gmail.com"; // it's combining first name with underscore and birth year and @gmail.com"
        String outlook = emailPattern + "@outlook.com"; // it's combining first name with underscore and birth year and @outlook.com"

        System.out.println("yahoo: " + yahoo);
        System.out.println("gmail: " + gmail);
        System.out.println("outlook: " + outlook);

    }
}
/*
2. Create a class named EmailGenerator.

		Given the following variables:
		   - firstName
		   - birthYear

		 The program should generate emails for Gmail, Yahoo, and Outlook by combining the firstName with
		 an underscore and birthYear, followed by the domain of the email.

		 Example:
		   firstName = "Daniel"
		   birthYear = 1985

		 Output:
		   Your generated emails are:
		      Yahoo: Daniel_1985@yahoo.com
		      Gmail: Daniel_1985@gmail.com
		      Outlook: Daniel_1985@outlook.com
 */
