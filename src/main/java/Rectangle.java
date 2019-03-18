public class Rectangle implements AreaShape{
    private double width, height;

    public Rectangle(double i, double v) {
        this.width = i;
        this.height = v;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }

    @Override
    public String draw() {
        return "Rectangle";
    }
}
