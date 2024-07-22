package ex_21072024;

public class Lab113 {
    public static void main(String[] args) {
    // Function -> Block of code which we can be reuse multiple time.
    // 1. Pre-built -> Math.max()
    // 2. User created / defined

    // Two component of the functions
    // 1. Define
    // 2. Call the function


    for (int i = 0; i < 5; i++) {
        // 2. Call the function
        greet();
        }
        greet2();
    }

    // 1. Define outside of main method
    static void greet(){
        System.out.println("Hi, How are you?");
    }

    static void greet2(){
        System.out.println("greet2");
    }

}
