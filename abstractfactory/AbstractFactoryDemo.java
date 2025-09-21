package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        BikeFactory mountainFactory = new MountainBikeFactory();
        Bike mb = mountainFactory.createBike();
        Helmet mh = mountainFactory.createHelmet();
        mb.ride();
        mh.wear();

        BikeFactory roadFactory = new RoadBikeFactory();
        Bike rb = roadFactory.createBike();
        Helmet rh = roadFactory.createHelmet();
        rb.ride();
        rh.wear();
    }
}
