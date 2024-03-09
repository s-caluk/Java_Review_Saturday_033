package week11_review.array_review;

/**
 * This class contains several utility functions for manipulating strings.
 */
public class StringUtility {

    /**
     * This function reverses the order of characters in a string and returns the result.
     *
     * @param str the input string
     * @return the reversed string
     */
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * This function returns a string containing all unique characters in a given string.
     *
     * @param str the input string
     * @return the unique characters in the input string
     */
    public static String displayUniqueCharacter(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                unique += ch;
            }
        }
        return unique;
    }

    /**
     * This function prints all characters in a given string.
     *
     * @param str the input string
     */
    public static void printEachCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    /**
     * This function removes all duplicate characters from a given string and returns the result.
     *
     * @param str the input string
     * @return the string with no duplicate characters
     */
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;
    }

    /**
     * This function displays the frequency of each character in a given string.
     *
     * @param str the input string
     */
    public static void displayFrequencyOfEachCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + ": " + count);

        }

    }
}
