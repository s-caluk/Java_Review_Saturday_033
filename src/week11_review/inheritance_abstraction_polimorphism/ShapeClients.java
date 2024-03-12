package week11_review.inheritance_abstraction_polimorphism;

public class ShapeClients {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10, 20);

        System.out.println(shape1.area());

        System.out.println(((Rectangle) shape1).getLength());
        System.out.println(((Rectangle) shape1).getWidth());

        /*

            Browser browser = new Edge();

            browser.open()


         */

    }
}
