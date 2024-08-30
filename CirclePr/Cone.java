
// Create a class named `Cone` that inherits the `Circle`
public class Cone extends Circle {

    // Initialize a height variable for the constructor because it takes two
    // parameters (radius and height)
    int height;

    // A constructor that creates a `Cone` with the specified radius and height 
    public Cone(int radius, int height) {
        // and passes the radius to the parent constructor
        super(radius);
        this.height = height;
    }

    //A method named `volume` that returns the computed value of the volume
    public double volume() {
        return (1.0 / 3) * Math.PI * Math.pow(getRadius(), 2) * height;
    }

    // A method named `volume` that returns the computed value of the volume
    public double cost() {
        // Volume = (1/3) * π * radius * radius * height
        return 78.60 * area();
    }

    // A method named `display` that overrides the parent display method
    @Override
    public void display() {
        super.display();
        System.out.println(volume());
        System.out.println(cost());
    }
}
