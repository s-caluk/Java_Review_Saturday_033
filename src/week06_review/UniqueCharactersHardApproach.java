package week06_review;

public class UniqueCharactersHardApproach {
    public static void main(String[] args) {

        String str = "aabccccd";

        String unique = ""; //bd

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //a
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }

            if (count == 1) {
                unique += ch;
            }

        }
        System.out.println(unique);
    }
}

/*
Write a program that can return the unique characters from a string

        Example:
            str = "aabcccd"

        Output:
            "bd"
 */