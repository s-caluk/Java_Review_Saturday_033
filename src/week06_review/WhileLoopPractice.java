package week06_review;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;

        while(num >= 0){
            System.out.println("Enter a number:");
            num = input.nextInt();
        }

        System.out.println("-----------------------");

        String answer = "";

        while( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
            System.out.println("Enter yes or no:");
            answer = input.next();
        }


        System.out.println("-----------------------");

        String toContinue = "yes";

        while(true){
            System.out.println("Hello World");
            System.out.println("Would you like to continue?");
            toContinue = input.next();

            while(!(toContinue.equalsIgnoreCase("yes") || toContinue.equalsIgnoreCase("no"))){
                System.out.println("Please re-enter! Would you like to continue?");
                toContinue = input.next();
            }

            if(toContinue.equalsIgnoreCase("no")){
                break;
            }

        }


        input.close();


    }
}
