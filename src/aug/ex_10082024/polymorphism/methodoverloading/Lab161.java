package aug.ex_10082024.polymorphism.methodoverloading;

public class Lab161 {
    // polymorphism

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result1 = mathOperations.add(2, 3);

        double result2 = mathOperations.add(2.4, 6.3);
        String result3 = mathOperations.add("Sofiya","Ansari");
        String result4 = mathOperations.add("Sofiya", 123);
       // String result4 = mathOperations.add("Sofiya", 12.34);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        }
    }

