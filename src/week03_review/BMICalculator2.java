package week03_review;

public class BMICalculator2 {
    public static void main(String[] args) {

        double height = 1.85;
        double weight = 80.5;

        boolean valid = height > 0 && weight > 0;  // Both the height or the weight should be greater than zero

        if (valid) { // if the given height and weight are valid

            double bmi = weight / (height * height); // calculate the BMI
            System.out.println("Your Body Mass Index (BMI): " + bmi); // Display the BMI

            String category; // Determine the BMI Category

            category = (bmi < 18.5) ? "Underweight" : (bmi >= 18.5 && bmi < 25) ? "Normal Weight"
                    : (bmi >= 25 && bmi < 30) ? "Overweight" : "Obesity";

            System.out.println("Category: " + category); // Displays the BMI category

            switch (category) {  // Displays the suggestion for different BMI category
                case "Overweight", "Obesity":
                    System.out.println("Suggestion: Stick to your diet");
                    break;
            }

        } else { // if the given height or weight is invalid
            System.err.println("Height or weight can not be negative or zero");
        }



    }
}
