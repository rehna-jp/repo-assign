package Hypo;

public class Main {
    public static void main(String[] args) {
        // Initialize the MyHypo object with specific values for base and height (e.g.,
        // base = 3 and height = 4)
        MyHypo hypo = new MyHypo(3, 4);

        // Print the base and height of the triangle
        System.out.println("Base: " + hypo.getBase());
        System.out.println("Height: " + hypo.getHeight());

        // Call the area() method and print the area of the triangle
        System.out.println("Area: " + hypo.area());

        // Call the hypotenuse() method and print the hypotenuse of the triangle
        System.out.println("Hypotenuse: " + hypo.hypotenuse());

        // Call the cost() method and print the total cost associated with the triangle
        System.out.println("Cost: " + hypo.cost());
    }
}
