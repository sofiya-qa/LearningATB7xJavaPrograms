package July.ex_14072024;

public class Lab035 {
    public static void main(String[] args) {

        // Type Casting - > Source and Destination conversion
          // Widening - Implicit, Explicit - lossless
          // Narrowing - Implicit, Explicit(With data type) -> loss of data

        // Widening
        byte b = 10;
        int a = b;  // VALID - > Implicit casting - JVM
        int a1 = (int)b; // VALID - > Explicit casting
        System.out.println(a1);

        // Narrowing
        int val = 300;

        // byte b1 = val; // Invalid -> Implicit Casting - JVM
        byte b1 = (byte)val; // Valid - Explicit Casting - // Loss of data

        System.out.println(b1);

    }
}
