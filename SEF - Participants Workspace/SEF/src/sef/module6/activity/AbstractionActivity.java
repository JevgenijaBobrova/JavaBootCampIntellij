package activity;

public class AbstractionActivity {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        rectangle.setBreadth(5);
        rectangle.setLength(6);
        System.out.println("The rectangle is " + rectangle.getColor());
        System.out.println("Rectangle area is " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter is " + rectangle.calculatePerimeter());
        System.out.println("----------------------------------------");

        Circle circle = new Circle();
        circle.setColor("Blue");
        circle.setRadius(5);
        System.out.println("The circle is " + circle.getColor());
        System.out.println("Circle area is " + circle.calculateArea());
        System.out.println("Circle perimeter is " + circle.calculatePerimeter());



    }
}
