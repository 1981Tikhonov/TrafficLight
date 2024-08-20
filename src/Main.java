public class Main {
    public static void main(String[] args) {
        // Использование фабрики
        TrafficLight roadLight = TrafficLightFactory.createTrafficLight("road");
        TrafficLight pedestrianLight = TrafficLightFactory.createTrafficLight("pedestrian");

        roadLight.showSignal();
        pedestrianLight.showSignal();

        // Использование адаптера
        AdvancedTrafficLight advancedRoadLight = new AdvancedRoadTrafficLight();
        TrafficLight adaptedLight = new TrafficLightAdapter(advancedRoadLight);
        adaptedLight.showSignal();

        // Использование компоновщика
        TrafficLightComposite composite = new TrafficLightComposite();
        composite.add(roadLight);
        composite.add(pedestrianLight);
        composite.showSignal();

        // Использование моста
        TrafficLightImplementor roadImpl = new RoadTrafficLightImpl();
        TrafficLightAbstraction abstraction = new RefinedTrafficLightAbstraction(roadImpl);
        abstraction.showSignal();

        // Использование декоратора
        TrafficLight timedLight = new TimedTrafficLightDecorator(roadLight);
        timedLight.showSignal();

        // Использование фасада
        TrafficLightFacade facade = new TrafficLightFacade();
        facade.showAllSignals();
    }
}
