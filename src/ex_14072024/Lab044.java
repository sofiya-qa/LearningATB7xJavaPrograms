package ex_14072024;

public class Lab044 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + a++ + a++); // A + B + C
        System.out.println(a);

        // A - ++a -> Exp1 = 11  , a = 11
        // + - operator
        // B - a++ -> Exp2 = 11 , a = 12
        // + - operator
        // C - a++ -> Exp3 = 12 , a = 13
        // A + B + C -> Exp1 + Exp2 + Exp3
        // 11 + 11 + 12
        // o\p : 34 , a = 13
    }
}
