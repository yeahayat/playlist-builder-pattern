package abstractfactory;

public class RoadHelmet implements Helmet {
    @Override
    public void wear() {
        System.out.println("Wearing a road helmet!");
    }
}
