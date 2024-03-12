package week11_review.collection_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindrome {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));

        List<String> result = new ArrayList<>(); //[]

        for (String each : list) {

            String reversedStr = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversedStr += each.charAt(i);
            }

            if (!each.equalsIgnoreCase(reversedStr)) {  // if the reversed string does not match the original string, then it's not palindrome
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println("--------------------------------");

        List<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(
                "Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"
        ));

        list2.removeIf(p -> isPalindrome(p));

        System.out.println(list2);


    }


    // a function that can verify if a string is palindrome and returns boolean
    public static boolean isPalindrome(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return str.equalsIgnoreCase(reversedStr);
    }


}

/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings.
The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}
 */
