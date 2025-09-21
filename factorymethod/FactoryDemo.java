package factorymethod;

public class FactoryDemo {
    public static void main(String[] args) {
        Bike b1 = BikeFactory.createBike("mountain");
        b1.ride();

        Bike b2 = BikeFactory.createBike("road");
        b2.ride();
    }
}
