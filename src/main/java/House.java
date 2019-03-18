public class House implements HasArea{
    private double area;
    House(double a){
        this.area = a;
    }
    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
