package week11_review.inheritance_abstraction_polimorphism;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

}