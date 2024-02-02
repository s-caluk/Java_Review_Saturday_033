package week04_review;

public class Automation {
    public static void main(String[] args) {

        String url = "www.google.com";
        String browser = "chrome";

        for (int i = 1; i < 8; i++) {
            System.out.println("---------------- 30 sounds pause -----------------");
            System.out.println("Opening the " + browser + " browser.."); // ChromeDriver()
            System.out.println("Navigating to " + url); //navigate()

            System.out.println("Executing the test case " + i);

            System.out.println("Getting the test result of test case " + i);
            System.out.println("Closing the " + browser +" browser.");
        }
    }
}
/*
1. Create a class named Automation and write a Java program
that simulates simple web automation for a given URL.

The program structure should include the following steps for automating 7 test cases:

        1. Open the specified browser
        2. Navigate to the URL

        3. Execute the test case

        4. Get the test result
        5. Close the browser
 */