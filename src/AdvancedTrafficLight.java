interface AdvancedTrafficLight {
    void showAdvancedSignal();
}

class AdvancedRoadTrafficLight implements AdvancedTrafficLight {
    @Override
    public void showAdvancedSignal() {
        System.out.println("Advanced Road Traffic Light: Red, Yellow, Green with timer");
    }
}

class TrafficLightAdapter implements TrafficLight {
    private AdvancedTrafficLight advancedTrafficLight;

    public TrafficLightAdapter(AdvancedTrafficLight advancedTrafficLight) {
        this.advancedTrafficLight = advancedTrafficLight;
    }

    @Override
    public void showSignal() {
        advancedTrafficLight.showAdvancedSignal();
    }
}
