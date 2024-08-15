package aug.ex_10082024.polymorphism.methodoverloading;

public class MathOperations {
   // Polymorphism -> One name many form
    // Types of Polymorphism
    // 1. Method Overloading | Compile Time Polymorphism | Static Binding or Early Binding
    // 2. Method Overriding | Run Time Polymorphism | Dynamic Binding


    // Encapsulation
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method Overloading
    // One or more methods with the same name but different arguments

    int add(int a, int b){

        return a+b;
    }

    double add(double a, double b){

        return a+b;
    }

    double add(double a, double b, float f){

        return a+b+f;
    }

    String add(String a, String b){

        return a+b;
    }

    String add(String a, int b) {
        return a + b;
    }

    String add(int b, String a) {
        return a + b;
    }

    MathOperations() {
    }

    MathOperations(int a, int b) {
    }

    MathOperations(int a, int b, int c) {
    }

    MathOperations(int a, int b, String c) {
    }
}
