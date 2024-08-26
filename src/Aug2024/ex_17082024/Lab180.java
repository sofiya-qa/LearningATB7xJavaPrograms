package Aug2024.ex_17082024;

public class Lab180 {
}

// Nested Class - Rarely you will be using it

class OC{
    Integer  a = 10;    // Instance variable

    void outerClass_m2(){
        // System.out.println(b);
        System.out.println("OC_M1");
    }

    static class p {

    }

    class InnerClass{
        Integer b = 20;
        void innerClass_m2(){
            System.out.println(a);
            System.out.println("IC_M2");
        }
    }
}
