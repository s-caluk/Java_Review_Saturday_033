package week11_review.collection_map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Uniques {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<String, Integer> map = new LinkedHashMap<>(); //  {b=1, d=1, f=1}

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if(frequency == 1) {
                map.put(each, frequency);
            }
        }

        System.out.println(map);

        System.out.println("--------------------------------");

        map.entrySet().stream().forEach(e -> System.out.println(e));


    }

}

/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */