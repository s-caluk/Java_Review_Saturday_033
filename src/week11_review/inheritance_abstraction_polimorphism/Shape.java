package week11_review.inheritance_abstraction_polimorphism;

public abstract class Shape {
    private final String name;

    public Shape() {
        this.name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public abstract double area();

}
