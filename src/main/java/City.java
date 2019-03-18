import java.util.List;

public class City implements SumProvider{
    List<House> houses;
    City(List<House> house){
        this.houses = house;
    }
    public double sum(){
        double sum = 0;
        for(House a : houses){
            sum+= a.getArea();
        }
        return sum;
    }
}
