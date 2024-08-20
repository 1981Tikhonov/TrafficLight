class TrafficLightFactory {
    public static TrafficLight createTrafficLight(String type) {
        switch (type.toLowerCase()) {
            case "road":
                return new RoadTrafficLight();
            case "pedestrian":
                return new PedestrianTrafficLight();
            case "bicycle":
                return new BicycleTrafficLight();
            case "railroad":
                return new RailroadTrafficLight();
            case "aerodrome":
                return new AerodromeTrafficLight();
            default:
                throw new IllegalArgumentException("Unknown traffic light type");
        }
    }
}
