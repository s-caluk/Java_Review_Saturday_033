package week11_review.array_review;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int[] reverse = ArraysUtility.reverseArray(arr);

        System.out.println(Arrays.toString(reverse));


        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] a3 = ArraysUtility.combineArrays(a1, a2);

        System.out.println(Arrays.toString(a3));

    }
}
