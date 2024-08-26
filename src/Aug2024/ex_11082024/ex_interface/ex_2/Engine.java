package Aug2024.ex_11082024.ex_interface.ex_2;

interface Engine {

    void startEngine();
    void stopEngine();

    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2();  // Incomplete function
    void m3();

    //  Complete function is not possible in interface

//        void m4() {
//        System.out.println("Not possible");
//        }
}
