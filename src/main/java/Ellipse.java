public class Ellipse implements AreaShape{
    private double x_radius;
    private double y_radius;

    public Ellipse(double i, double v) {
        this.x_radius = i;
        this.y_radius = v;
    }

    public double getX_radius() {
        return x_radius;
    }

    public void setX_radius(double x_radius) {
        this.x_radius = x_radius;
    }

    public double getY_radius() {
        return y_radius;
    }

    public void setY_radius(double y_radius) {
        this.y_radius = y_radius;
    }
    public double getArea(){
        return Math.PI*this.x_radius*this.y_radius;
    }

    @Override
    public String draw() {
        return "Ellipse";
    }
}
