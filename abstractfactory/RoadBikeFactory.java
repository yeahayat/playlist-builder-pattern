package abstractfactory;

public class RoadBikeFactory implements BikeFactory {
    @Override
    public Bike createBike() {
        return new RoadBike();
    }
    @Override
    public Helmet createHelmet() {
        return new RoadHelmet();
    }
}
