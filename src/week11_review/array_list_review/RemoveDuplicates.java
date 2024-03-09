package week11_review.array_list_review;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        //remove duplicated elements from list
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);

        System.out.println("----------2.cözüm----------------------");

        ArrayList<Integer> newList2 = new ArrayList<>();

        for (Integer each : list) {
            if (!newList2.contains(each)) {
                newList2.add(each);
            }

        }
        System.out.println(newList2);


    }
}

/*
8. Create a class called RemoveDuplicates and write a program with the following specifications:
   8.1 Given an ArrayList of integers, remove duplicated numbers.

			Example:
				list = [1,1,2,2,3,3,4,4,5,6,7]

			Output:
				[1,2,3,4,5,6,7]
 */
