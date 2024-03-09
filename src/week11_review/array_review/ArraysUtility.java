package week11_review.array_review;

/**
 * This class contains utility methods for working with arrays.
 * dokumantasyonunu AI yaptirdi , sonra daha okunur hale otomatik getirdi
 */
public class ArraysUtility {

    /**
     * This method reverses the order of the elements in an integer array and returns the reversed array.
     *
     * @param arr the integer array to be reversed
     * @return the reversed integer array
     */
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    /**
     * This method reverses the order of the elements in a double array and returns the reversed array.
     *
     * @param arr the double array to be reversed
     * @return the reversed double array
     */
    public static double[] reverseArray(double[] arr) {
        double[] reversedArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    /**
     * This method reverses the order of the elements in a char array and returns the reversed array.
     *
     * @param arr the char array to be reversed
     * @return the reversed char array
     */
    public static char[] reverseArray(char[] arr) {
        char[] reversedArray = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    /**
     * This method reverses the order of the elements in a string array and returns the reversed array.
     *
     * @param arr the string array to be reversed
     * @return the reversed string array
     */
    public static String[] reverseArray(String[] arr) {
        String[] reversedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    /**
     * This method combines two integer arrays and returns a new combined array.
     *
     * @param arr1 the first integer array
     * @param arr2 the second integer array
     * @return the combined integer array
     */
    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int[] combinedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }
        return combinedArray;
    }

    /**
     * This method combines two double arrays and returns a new combined array.
     *
     * @param arr1 the first double array
     * @param arr2 the second double array
     * @return the combined double array
     */
    public static double[] combineArrays(double[] arr1, double[] arr2) {
        double[] combinedArray = new double[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }
        return combinedArray;
    }

    /**
     * This method combines two char arrays and returns a new combined array.
     *
     * @param arr1 the first char array
     * @param arr2 the second char array
     * @return the combined char array
     */
    public static char[] combineArrays(char[] arr1, char[] arr2) {
        char[] combinedArray = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }
        return combinedArray;
    }

    /**
     * This method combines two string arrays and returns a new combined array.
     *
     * @param arr1 the first string array
     * @param arr2 the second string array
     * @return the combined string array
     */
    public static String[] combineArrays(String[] arr1, String[] arr2) {
        String[] combinedArray = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }
        return combinedArray;
    }

}
