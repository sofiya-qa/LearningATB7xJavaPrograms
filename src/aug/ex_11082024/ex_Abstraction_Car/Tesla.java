package aug.ex_11082024.ex_Abstraction_Car;

public class Tesla extends Engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stopping Tesla");
    }

    @Override
    void speed() {
        System.out.println("300Km/Hr");
    }

    @Override
    void partGearBox() {
        System.out.println("Electric");
    }

    @Override
    void openCar() {
        System.out.println("Open Tesla");
    }
}
