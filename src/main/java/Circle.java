public class Circle implements AreaShape{
    private double radius;

    public Circle(double i) {
        this.radius = i;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (radius *radius * Math.PI);
    }

    @Override
    public String draw() {
        return "Circle";
    }

}
