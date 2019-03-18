public class AreaXMLOutputter {
    private double area;
    AreaXMLOutputter(SumProvider a) {
        this.area = a.sum();
    }

    public String output(){
        return  "<area>" + area + "</area>";
    }

}
