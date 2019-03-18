import java.util.ArrayList;
import java.util.List;

public class Application {
 /*   public static void main(String[] args) {
        AreaAggregator area = new AreaAggregator();
        Square a = new Square();
        a.setSide(10);
        Circle b = new Circle();
        b.setRadius(1);
        Ellipse c = new Ellipse();
        c.setX_radius(2);
        c.setY_radius(1);
        Triangle d = new Triangle();
        d.setBase_size(10);
        d.setHeight(5);
        area.addShape(a);
        area.addShape(b);
        area.addShape(c);
        area.addShape(d);
        House q = new House(330);
        area.addShape(q);
        AreaStringOutputter stringOutputter = new AreaStringOutputter(area);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(area);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());

    }
*/
 public static void main(String[] args) {
     AreaAggregator aggregator = new AreaAggregator();

     aggregator.addShape(new Square(10));
     aggregator.addShape(new Circle(5));
     aggregator.addShape(new Circle(2));
     aggregator.addShape(new Ellipse(2, 3));
     aggregator.addShape(new Rectangle(10, 5));
     aggregator.addShape(new Triangle(10, 2));
     aggregator.addShape(new House(100));

     AreaStringOutputter stringOutputter = new AreaStringOutputter(aggregator);
     AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(aggregator);

     System.out.println(stringOutputter.output());
     System.out.println(xmlOutputter.output());

     List<House> houses = new ArrayList<>();
     houses.add(new House(50));
     houses.add(new House(150));

     City city = new City(houses);

     AreaStringOutputter cityStringOutputter = new AreaStringOutputter(city);
     AreaXMLOutputter cityXmlOutputter = new AreaXMLOutputter(city);

     System.out.println(cityStringOutputter.output());
     System.out.println(cityXmlOutputter.output());
 }

}
