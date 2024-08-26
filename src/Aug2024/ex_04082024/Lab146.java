package Aug2024.ex_04082024;

public class Lab146 {

    int e = 45;  // Instance variable != Global variable

    void f1(){
        int e = 10;  // Local variable -> local to the function
        System.out.println(e);
    }

    void f2(){
        System.out.println(e);  // Not possible -> bcuz its Local variable
    }

    void f3(){
        e = 50;
        System.out.println(e);
    }

    public static void main(String[] args) {
        Lab146 object = new Lab146();
        object.f1();
        object.f2();
        object.f3();
    }
}
