package activity;

public class Circle extends Shape{

    private double radius;

    //default constructor
    public Circle() {
    }

    //parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
