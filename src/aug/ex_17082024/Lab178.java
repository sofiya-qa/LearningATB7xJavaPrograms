package aug.ex_17082024;

public class Lab178 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.age);
        System.out.println(A.discount);
        A a2 = new A();
        A.m1();
        a.m2();


    }
}


class A{
    int age = 10;    // Instance variable
    static int discount = 199;  // static variable

    // SIB -> Static Initialized Block
    static {
        System.out.println("One Time Load SIB");
    }

    // IIB -> Instance Initialized Block
    {
        System.out.println("IIB When Object is created");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}