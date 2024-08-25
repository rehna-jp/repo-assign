package Hypo;

public class MyHypo extends Hypo{

    public MyHypo() {
        super(1,1);
    }


    public MyHypo(double base, double height) {
        super(base, height);
    }

    public double hypotenuse() {
        return (getBase() * getBase()) + (getHeight() * getHeight());
    }

    public double cost() {
        return (area() + hypotenuse() * 30.09);
    }

    
}
