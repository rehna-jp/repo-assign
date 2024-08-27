package Hypo;

//Create a class named MyHypo that inherits from the Hypo class
public class MyHypo extends Hypo {

    // A non-argument constructor that creates a default object with a base and
    // height of 1
    public MyHypo() {
        super(1, 1);
    }

    // A constructor that initializes the MyHypo object with the specified values
    // for the base and height of the triangle
    public MyHypo(double base, double height) {
        super(base, height);
    }

    // A method named hypotenuse() that returns the computed hypotenuse of the
    // triangle
    public double hypotenuse() {
        //hypotenuse=((base* base )+(( heigh*height))
        return (getBase() * getBase()) + (getHeight() * getHeight());
    }

    //A method named cost() that returns the cost of the triangle
    public double cost() {
        //cost=(area+hypotenuse)×30.09
        return (area() + hypotenuse() * 30.09);
    }

}
