package Hypo;

public class Main {
    public static void main(String[] args) {
        MyHypo hypo = new MyHypo(3, 4);

        System.out.println("Base: " + hypo.getBase());
        System.out.println("Height: " + hypo.getHeight());
        System.out.println("Area: " + hypo.area());
        System.out.println("Hypotenuse: " + hypo.hypotenuse());
        System.out.println("Cost: " + hypo.cost());
    }
}
