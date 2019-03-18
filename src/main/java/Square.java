public class Square implements AreaShape{
    private double side;

    public Square(double i) {
        this.side = i;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    @Override
    public String draw() {
        return "Square";
    }
}
