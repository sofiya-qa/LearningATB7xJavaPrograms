package Aug2024.ex_11082024.ex_interface.ex_1;

public class Lab169 {
    // Interface - Hide the implementation
    // Interface variables will be inherited to subclasses.
    // interface is a keyword which is used to define User Defined Datatypes.

    public static void main(String[] args) {
//        Engine e = new Engine();  // we can't create object of interface same as abstraction class
        WagonR r = new WagonR();
        r.drive();
    }
}
