public class AreaStringOutputter {
    private double area;
    AreaStringOutputter(SumProvider area){
        this.area = area.sum();
    }

    public String output() {
        return "Sum of areas: " + area; //+ area.drawing();
    }

}
