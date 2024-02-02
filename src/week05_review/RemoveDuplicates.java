package week05_review;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbcc"; // a, a, b, b, c, c

        String result = ""; // "abc"

        for (int i = 0; i < str.length(); i++) { //i: 0 to last index of str

            char ch = str.charAt(i); // each character of str

            // contains method only tasking string argument
            if (result.contains("" + ch)) { // if the string result already contained the character
                continue; // skip to the next iteration
            } else {// if the character hasn't been added to the string result yet
                result += ch; //then add the character to the result
            }
            /*
            if(!result.contains(""+ch)){ // if the character is not contained in the string result.
                result += ch; // then add the character to the string result
            }
             */
        }


        System.out.println("result = " + result);


    }
}
/*
Write a program that can remove the duplicated characters from a string

        Example:
            str = "aabbbcccc"

        Output:
            "abc"
 */