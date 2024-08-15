package aug.ex_11082024.ex_interface.ex_1;

public class WagonR implements Engine{
    void drive(){
    startEngine();
    stopEngine();
    }


    @Override
    public void startEngine() {
        System.out.println("Wagon R is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Wagon R is stopping");
    }
}
