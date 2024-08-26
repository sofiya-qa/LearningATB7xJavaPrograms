package Aug2024.ex_17082024;

public class Lab181 {
    public static void main(String[] args) {
    Car c = new Car("Lambo");
    c.drive();
        System.out.println(c.make);

        // To access the inner class object creation.
        Car.GearBox cg = c.new GearBox();
        cg.m2();
    }
}

class Car {
    String make;

    public Car(String make) {
        this.make = make;
    }

    // Method
    void drive(){
        System.out.println("You can drive Car");
    }

    class GearBox {
        void m2(){
            System.out.println("m2");
        }
        class NutBolts {

        }
    }
}
