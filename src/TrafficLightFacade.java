class TrafficLightFacade {
    private TrafficLight roadTrafficLight;
    private TrafficLight pedestrianTrafficLight;
    private TrafficLight bicycleTrafficLight;

    public TrafficLightFacade() {
        roadTrafficLight = TrafficLightFactory.createTrafficLight("road");
        pedestrianTrafficLight = TrafficLightFactory.createTrafficLight("pedestrian");
        bicycleTrafficLight = TrafficLightFactory.createTrafficLight("bicycle");
    }

    public void showAllSignals() {
        roadTrafficLight.showSignal();
        pedestrianTrafficLight.showSignal();
        bicycleTrafficLight.showSignal();
    }
}
