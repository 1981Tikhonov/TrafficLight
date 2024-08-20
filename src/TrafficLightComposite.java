import java.util.ArrayList;
import java.util.List;

class TrafficLightComposite implements TrafficLight {
    private List<TrafficLight> trafficLights = new ArrayList<>();

    public void add(TrafficLight trafficLight) {
        trafficLights.add(trafficLight);
    }

    public void remove(TrafficLight trafficLight) {
        trafficLights.remove(trafficLight);
    }

    @Override
    public void showSignal() {
        for (TrafficLight trafficLight : trafficLights) {
            trafficLight.showSignal();
        }
    }
}
