//1972019-JeftaBenedictAmpouw
public class InheritanceB extends Inheritance{
    protected double radius;

    public InheritanceB() {
    }

    public InheritanceB(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*(radius*radius);
    }
}
