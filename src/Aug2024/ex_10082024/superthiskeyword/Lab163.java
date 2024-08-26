package Aug2024.ex_10082024.superthiskeyword;

public class Lab163 {

    // super()
    // 1. USe of super with Variables
    // 2. Use of super with Methods
    // 3. Use of super with constructors

    // super keyword
    // In Java is a reference variable that allows a subclass
    // to refer to its parent class.

    public static void main(String[] args) {
        Car s = new Car();
        s.display();
    }
}
class Car extends Vehicle{
    private int maxSpeed = 281;

    public Car() {
        super(10);   // Constructor Chaining -> Child constructor can also call parent constructor
        System.out.println("DC Car");
    }

    public void display(){
        System.out.println("Car speed is -> " + this.maxSpeed);
        System.out.println("Vehicle speed is -> " + super.maxSpeed);
        super.message(); // This method belong to Parent Class - > Vehicle Class
        this.message();  // This method belong to Child/Sub Class - > Car Class
    }

    @Override
    void message(){
        System.out.println("Hello Vehicle");
    }
}

class Vehicle{

    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("DC Vehicle");
    }

    Vehicle(int a) {
        System.out.println("PC Vehicle");
    }

    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a){
        System.out.println("Hello Vehicle");
    }
}
