package week04_review;

public class BranchingStatements {
    public static void main(String[] args) {
        String url = "www.google.com";
        String browser = "chrome";

        for (int i = 1; i < 8; i++) {

            /*
            if(i == 3 || i == 6){ // if the iteration number is 3 or 6
                continue; // jumps to the next iteration.
                 // When the continue statement gets executed, the remaining codes inside the loops body will be skipped
            }
             */

            if(i == 5){ // if the iteration number is 5.
                break; // exits the current loop
                // return; // exits the current method
            }

            System.out.println("---------------- 30 sounds pause -----------------");
            System.out.println("Opening the " + browser + " browser.."); // ChromeDriver()
            System.out.println("Navigating to " + url); //navigate()

            System.out.println("Executing the test case " + i);

            System.out.println("Getting the test result of test case " + i);
            System.out.println("Closing the " + browser +" browser.");

        }
    }
}
