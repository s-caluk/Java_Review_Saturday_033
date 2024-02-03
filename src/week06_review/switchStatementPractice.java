package week06_review;

public class switchStatementPractice {
    public static void main(String[] args) {

        double n1 = 100,
                n2 = 15;

        char mathOperator = '/'; //  a / b

        switch (mathOperator) {

            case '-':
                System.out.println("Subtraction: " + (n1 - n2));
                break;

            case '+':
                System.out.println("Addition: " + (n1 + n2));
                break;

            case '*':
                System.out.println("Multiplication: " + (n1 * n2));
                break;

            case '/':
                if (n2 == 0) {
                    System.out.println("can not divide a number by zero");
                } else {
                    System.out.println("Division: " + (n1 / n2));
                }
                break;

            default:
                System.out.println("Invalid math operator");

        }

    }
}

/*
10. Create a class called Calculator. Given two double variables named n1 and n2 and a char
variable named mathOperator, write a program that calculates the result of n1 and n2 based on
the given math operator.

		char operator -> -, +, *, /

		When the operator is +: add n1, n2
		When the operator is -: subtract n1, n2
		When the operator is *: multiply n1, n2
		When the operator is /: divide n1, n2
		        If the denominator is zero, then display "can not divide by zero" instead of the division
		For any other operators, print "invalid operator."

            Example:
                  n1 = 10, n2 = 20, mathOperator = '+'

            Output:
                  30
 */
