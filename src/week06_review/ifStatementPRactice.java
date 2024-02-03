package week06_review;

public class ifStatementPRactice {
    public static void main(String[] args) {

        int a = 25,
                b = 10,
                c = 20;

        boolean aIsMedian = (b > a && a > c) || (c > a && a > b);
        boolean bIsMedian = (a > b && b > c) || (c > b && b > a);
        boolean cIsMedian = (a > c && c > b) || (b > c && c > a);


        if(aIsMedian){ // if A is the median number between those three different numbers

            System.out.println(a + " is the median number");

        }else if(bIsMedian){ // if B is the median number between those three different numbers

            System.out.println(b + " is the median number");

        }else{ // Otherwise: if C is the median number between those three different numbers
            System.out.println(c + " is the median number");
        }

    }
}

/*
2. Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).

			Example:
				   a = 10;
				   b = 15;
				   c = 20;

			Output:
				  15 is the median number
 */