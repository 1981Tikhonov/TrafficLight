abstract class TrafficLightDecorator implements TrafficLight {
    protected TrafficLight decoratedTrafficLight;

    public TrafficLightDecorator(TrafficLight decoratedTrafficLight) {
        this.decoratedTrafficLight = decoratedTrafficLight;
    }

    public void showSignal() {
        decoratedTrafficLight.showSignal();
    }
}

class TimedTrafficLightDecorator extends TrafficLightDecorator {
    public TimedTrafficLightDecorator(TrafficLight decoratedTrafficLight) {
        super(decoratedTrafficLight);
    }

    @Override
    public void showSignal() {
        decoratedTrafficLight.showSignal();
        showTimer();
    }

    private void showTimer() {
        System.out.println("Traffic Light with Timer");
    }
}
