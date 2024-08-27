package Hypo;

//Create a class named Hypo
public class Hypo {
    // Two double data fields named base and height that represent the base and
    // height of a triangle. These data fields should be encapsulated (i.e.,
    // declared as private).
    private double base;
    private double height;

    // A constructor that initializes the Hypo object with the specified values for
    // the base and height of the triangle
    public Hypo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // A constructor that initializes the Hypo object with the specified values for
    // the base and height of the triangle
    public double getBase() {
        return base;
    }

    // A method named getHeight() that returns the height of the triangle
    public double getHeight() {
        return height;
    }

    // A method named getHeight() that returns the height of the triangle
    public double area() {
        //area=12×base×height
        return 12 * getBase() * getHeight();
    }

}
