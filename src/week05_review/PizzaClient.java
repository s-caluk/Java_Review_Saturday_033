package week05_review;
//nesnelerin degerlerinin el ile girilmis hali
public class PizzaClient {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        /*
        pizza1.size = "Small";
        pizza1.quantity = 4;
        pizza1.numberOfCheeseTopping = 3;
        pizza1.numberOfPepperoniTopping = 4;
         */
        pizza1.setInfo("Small", 4, 3, 4);

        Pizza pizza2 = new Pizza();
        /*
        pizza2.size = "Medium";
        pizza2.quantity = 2;
        pizza2.numberOfCheeseTopping = 2;
        pizza2.numberOfPepperoniTopping = 5;
         */
        pizza2.setInfo("Medium", 2, 2, 5);


        Pizza pizza3 = new Pizza();
        pizza3.setInfo("Large", 10, 7, 8);


        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        // COme back at 11:47 AM US EST

        System.out.println(pizza1.calcCost());
        System.out.println(pizza2.calcCost());
        System.out.println(pizza3.calcCost());


    }
}
