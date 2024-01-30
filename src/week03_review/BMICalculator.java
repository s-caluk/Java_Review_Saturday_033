package week03_review;

public class BMICalculator {
    public static void main(String[] args) {

        double height = 1.60;
        double weight = 80.5;

        double bmi = weight / (height * height);
        System.out.println("Your Body Mass Index (BMI): " + bmi);

// 1.2 Use the calculated BMI to determine the BMI category

        String category;

        if (bmi < 18.5) { // if the bmi is less than 18.5
            category = "Underweight";

        } else if (bmi >= 18.5 && bmi < 25) {  // if the bmi is between 18.5 (included) to 25 (excluded)
            category = "Normal Weight";

        } else if (bmi >= 25 && bmi < 30) {
            category = "Overweight";

        } else {
            category = "Obesity";

        }

        System.out.println("Category: " + category);  // Display the BMI category

// 1.3 Give Suggestion to the users that are in Overweight and Obisity category
        switch (category) {
            case "Overweight" , "Obesity":
                System.out.println("Suggestion: Stick to your diet");
                break;

        }

    }
}
/*
1. Create a Java class named BMICalculator with the following requirements:

    1.1 Define two variables within the class:
            height: Represents the user's height in meters.
            weight: Represents the user's weight in kilograms.

    1.2 Write a program that calculates the user's Body Mass Index (BMI) using the formula:

            BMI = weight / (height * height)

    1.3 Determine the BMI category based on the calculated BMI using the following criteria:

            Underweight: BMI < 18.5
            Normal Weight: 18.5 <= BMI < 25
            Overweight: 25 <= BMI < 30
            Obesity: BMI >= 30

    1.4 Display the calculated BMI and BMI category in the following format:

            Example:
                height = 1.75
                weight = 73.5

            Output:
                Your Body Mass Index (BMI): 24.0
                Category: Normal Weight


    Ensure that the program provides accurate BMI calculations and clearly communicates the user's BMI category based
     on the specified criteria.
 */