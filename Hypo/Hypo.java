package Hypo;

public class Hypo {
    private double base;
    private double height;

    public Hypo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Hypo() {
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return 0.5 * getBase() * getHeight();
    }

}
