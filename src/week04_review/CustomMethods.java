package week04_review;

public class CustomMethods {
    public static void main(String[] args) {

        int sum = calculate(100,  '+', 200);

        System.out.println(sum);

        System.out.println(sum * 100);

        double r = calculate(2.5, '*', 3.5);

        System.out.println(r);

    }


    public static int calculate(int firstNumber, char operator, int secondNumber) {
        int result = 0;

        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
        }

        return result;
    }


    public static double calculate(double firstNumber, char operator, double secondNumber) {
        double result = 0;

        switch (operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> result = firstNumber / secondNumber;
        }

        return result;
    }



}

/*
Create a method named calculate that accepts three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)

        if the operator is +:
                the method should return the addition of the two numbers

        if the operator is -:
                the method should return the subtraction of the two numbers

        if the operator is *:
                the method should return the multiplication of the two numbers

        If the operator is /:
                    then the method should return the division

        for any other operators, the method should return 0
 */
