interface TrafficLightImplementor {
    void showSignalImpl();
}

class RoadTrafficLightImpl implements TrafficLightImplementor {
    @Override
    public void showSignalImpl() {
        System.out.println("Road Traffic Light Implementation: Red, Yellow, Green");
    }
}

abstract class TrafficLightAbstraction {
    protected TrafficLightImplementor implementor;

    protected TrafficLightAbstraction(TrafficLightImplementor implementor) {
        this.implementor = implementor;
    }

    public abstract void showSignal();
}

class RefinedTrafficLightAbstraction extends TrafficLightAbstraction {
    public RefinedTrafficLightAbstraction(TrafficLightImplementor implementor) {
        super(implementor);
    }

    @Override
    public void showSignal() {
        implementor.showSignalImpl();
    }
}
