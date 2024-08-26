package Aug2024.ex_17082024;

public class Lab175 {
    public static void main(String[] args) {
        // Primitive to wrapper class

        int a = 10;
        Integer b = a;
       // Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(b);  // When we use wrapper( int to Integer) extra utilities are added


        // Wrapper class to Primitive
        Integer a2 = 42;    // Auto Boxing - int -> Integer conversion
        int value = a2;     // Unboxing - Integer -> int conversion
        System.out.println(a2);
        System.out.println(value);  // We loose the attribute/ Behavior when we convert Integer to int
    }
}
