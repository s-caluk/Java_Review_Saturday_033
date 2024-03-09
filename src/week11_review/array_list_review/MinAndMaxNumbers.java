package week11_review.array_list_review;

import java.util.ArrayList;
import java.util.Arrays;

public class MinAndMaxNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        int max = list.get(0);
        int min = list.get(0);

        for(int each: list){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }


        System.out.println("maximum number is: " + max);
        System.out.println("minimum number is: " + min);

    }
}
