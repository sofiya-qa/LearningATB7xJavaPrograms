package Aug2024.ex_11082024.ex_Abstraction_Car;

public class WagonR extends Engine {

     void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting WagonR");
    }

    @Override
    void stop() {
        System.out.println("Stopping WagonR");
    }

    @Override
    void speed() {
        System.out.println("100Km/Hr");
    }

    @Override
    void partGearBox() {
        System.out.println("WagonR/Hr");
    }

    @Override
    void openCar() {
        System.out.println("Open keys");
    }
}
