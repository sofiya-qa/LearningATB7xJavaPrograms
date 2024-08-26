package Aug2024.ex_11082024.ex_Abstraction_Car;

abstract class Keys {
    abstract void openCar();
}

class ConcreteClass{
    // no keyword of abstract in the area
}

abstract class IncompleteAbstractClass{
    abstract void f1();
    abstract String f2();
    abstract boolean f3();
    abstract long f4();
}
