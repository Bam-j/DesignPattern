package Facade;

public class FacadeMain {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();

        car.turnOnAllSystem();
        car.turnOffAllSystem();
    }
}
