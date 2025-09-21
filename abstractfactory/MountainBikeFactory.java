package abstractfactory;

public class MountainBikeFactory implements BikeFactory {
    @Override
    public Bike createBike() {
        return new MountainBike();
    }
    @Override
    public Helmet createHelmet() {
        return new MountainHelmet();
    }
}
