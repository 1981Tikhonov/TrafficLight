class RoadTrafficLight implements TrafficLight {
    @Override
    public void showSignal() {
        System.out.println("Road Traffic Light: Red, Yellow, Green");
    }
}

class PedestrianTrafficLight implements TrafficLight {
    @Override
    public void showSignal() {
        System.out.println("Pedestrian Traffic Light: Red, Green");
    }
}

class BicycleTrafficLight implements TrafficLight {
    @Override
    public void showSignal() {
        System.out.println("Bicycle Traffic Light: Red, Yellow, Green");
    }
}

class RailroadTrafficLight implements TrafficLight {
    @Override
    public void showSignal() {
        System.out.println("Railroad Traffic Light: Red, Green");
    }
}

class AerodromeTrafficLight implements TrafficLight {
    @Override
    public void showSignal() {
        System.out.println("Aerodrome Traffic Light: Red, Yellow, Green");
    }
}
