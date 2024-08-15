package aug.ex_11082024.ex_Abstraction_Car;

class Car extends Engine{
    // Engine
    // GearBox
    // Keys

    // Tesla is A Car
    // Tesla - DRIVE()


    @Override
    void start() {
        System.out.println("Start a car");
    }

    @Override
    void stop() {
        System.out.println("Stop a car");
    }

    @Override
    void partGearBox() {
        System.out.println("Part of Gearbox");
    }

    @Override
    void openCar() {
        System.out.println("Open car with keys");
    }

    @Override
    void speed() {
        System.out.println("Car");
    }
}
