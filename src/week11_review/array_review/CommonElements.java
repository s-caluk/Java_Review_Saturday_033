package week11_review.array_review;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i] + " ");
                }
            }
        }
        System.out.println("----------------");
        //better solution
        for (int each : arr1) {
            for (int each2 : arr2) {
                if (each == each2) {
                    System.out.println(each);
                }
            }
        }
    }
}

/*
7. Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.

			Example:
				arr1: {1,2,3,4,5}
				arr2: {4,5,6,7,8}

			Output:
				4
				5
 */