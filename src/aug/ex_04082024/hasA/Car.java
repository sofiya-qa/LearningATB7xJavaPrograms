package aug.ex_04082024.hasA;

public class Car {

    // Aggregation - hasA relationship
    void StartTheCar(){

        new Engine().start();
        new Tyres().rolling();
    }
}
