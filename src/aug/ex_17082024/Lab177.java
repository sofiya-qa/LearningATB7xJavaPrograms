package aug.ex_17082024;

import aug.ex_10082024.polymorphism.methodoverridding.Dog;

public class Lab177 {
    public static void main(String[] args) {
        Double d = 3.14;    // Heap Area
        double val = d.doubleValue();   // Continues Memory
        System.out.println(d);
        System.out.println(val);


        String s1 = "sofiya"; // SCP
        String s2 = new String("sofiya"); // HEAP
    }
}
