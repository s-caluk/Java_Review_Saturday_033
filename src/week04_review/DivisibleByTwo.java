package week04_review;

public class DivisibleByTwo {
    public static void main(String[] args) {

        int number = 40;
        int count = 0;

        while(number % 2 == 0){
            number /= 2;
            count++;
        }
        System.out.println(count + " times");

    }
}

/*
2. Create a Java class named DivisibleByTwo and write a program that calculates
how many times a given number can be evenly divided by 2.

        Example:
                Input: 40

        Output:
                3 times


    Explanation:
            40 / 2 ==> 20
            20 / 2 ==> 10
            10 / 2 ==> 5

            In total, it can be divided 3 times.
 */