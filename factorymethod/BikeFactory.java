package factorymethod;

public class BikeFactory {
    public static Bike createBike(String type) {
        if (type.equalsIgnoreCase("mountain")) {
            return new MountainBike();
        } else if (type.equalsIgnoreCase("road")) {
            return new RoadBike();
        } else {
            throw new IllegalArgumentException("Unknown bike type: " + type);
        }
    }
}
