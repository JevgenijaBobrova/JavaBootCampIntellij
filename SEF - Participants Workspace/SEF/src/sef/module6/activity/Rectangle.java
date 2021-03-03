package activity;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    //default constructor
    public Rectangle(){
    }

    //parameterized constructor
    public Rectangle (double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }


    public double calculatePerimeter() {
        return (length * 2) + (breadth * 2);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}