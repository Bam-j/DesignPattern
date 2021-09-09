package Factory;

abstract class AirplaneFactory {
    public Airplane preparingAirplane(String planeType) {
        Airplane airplane = createAirplane(planeType);

        airplane.takeOff();
        airplane.fly();
        airplane.land();

        return airplane;
    }

    abstract Airplane createAirplane(String planeType);
}
