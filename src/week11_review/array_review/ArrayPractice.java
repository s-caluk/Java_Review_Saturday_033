package week11_review.array_review;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(arr[0]);    //1

        arr[0] = 100;

        System.out.println(arr[0]);   //100

        System.out.println(Arrays.toString(arr));  //[100, 2, 3, 4, 5, 6, 7]

        // update the last element to 700
        arr[arr.length - 1] = 700;

        System.out.println(arr[arr.length - 1]);  //700

        System.out.println(Arrays.toString(arr)); //[100, 2, 3, 4, 5, 6, 700]

        System.out.println("----------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("----------------");

        // for each
        for(int each: arr) {
            System.out.println(each);
        }


        System.out.println("----------------");

        // print the array elements in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("----------------");


        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10, 11, 12, 13, 14}};

        // get the third element of the second array from arr2D
        System.out.println(arr2D[1][2]);  //6

    }
}
