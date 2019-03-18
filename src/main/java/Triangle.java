public class Triangle implements AreaShape{
    private double base_size, height;

    public Triangle(double i, double v) {
        this.base_size = i;
        this.height = v;
    }

    public double getBase_size() {
        return base_size;
    }

    public void setBase_size(double base_size) {
        this.base_size = base_size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.base_size*this.height/2;
    }

    @Override
    public String draw() {
        return "Triangle";
    }
}
