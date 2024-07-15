package ex_14072024;

public class Lab041 {
    public static void main(String[] args) {

        int a = 10;

        //System.out.println(++a); // Exp = 11
        //System.out.println(a++); // Exp = 10

        System.out.println(a++ + a);  // A + B
        // A = a++ -> Exp = 10, a = 11
        // + -> operator
        // B = a -> 11
        // A+B = Exp + a -> 10 + 11
        // o/p : 21
    }
}
