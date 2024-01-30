package week03_review;

public class Operators {
    public static void main(String[] args) {

        int number = 500;

        System.out.println(number++); // 500
        System.out.println(number); // 501
        System.out.println(++number); //502

        int index = 0;

        System.out.println(index++); //0

        int age = 21;

        System.out.println(age > 21);  // false  excludes 21
        System.out.println(age >= 21); // true  includes 21

        System.out.println("------------------------------------------");

        boolean username = false;
        boolean email = false;
        boolean password = true;

        System.out.println(email && password);    //false
        System.out.println(username && password); //false
        System.out.println(username || email);    //false


        System.out.println(false & true);
        //                  false & true ====> false

        System.out.println(false && true);
        //                 false &&     ===> false


        System.out.println(true && true);
        //                 true && true ===> true

        System.out.println(true || true);
        //                 true ||     ===> true

        System.out.println(false || true);
        //                 false || true  ===> true




        int num = 80;

        // System.out.println(90 <= num <= 100);

        System.out.println( 90 <= num && num <= 100);
        //                   false    &&          ===> false


    }
}
