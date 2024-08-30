
//Create a class named `Circle`
public class Circle {

    // One encapsulated integer data field named `radius`
    private int radius;

    // A default constructor that sets `radius` to zero
    public Circle() {
        this.radius = 0;
    }

    // A constructor that creates a `Circle` with the specified radius
    public Circle(int radius) {
        this.radius = radius;
    }

    // A method named `getRadius` that returns the radius of the `Circle`
    public int getRadius() {
        return radius;
    }

    // A method named `area` that returns the area of the `Circle`
    public double area() {
        // Area = π * radius * radius
        return Math.PI * Math.pow(getRadius(), 2);
    }

    // A method named `display` that displays the area
    public void display() {
        System.out.println(area());
    }

}
