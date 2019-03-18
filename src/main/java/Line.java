public class Line implements Shape{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String draw() {
        return "Line";
    }
}
