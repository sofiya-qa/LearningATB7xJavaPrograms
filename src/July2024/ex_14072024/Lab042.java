package July2024.ex_14072024;

public class Lab042 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++ + ++a); // A + B
        System.out.println(a);

        // A - a++ -> Exp1 = 10 , a = 11
        // + - operator
        // B - ++a -> Exp2 = 12 , a = 12
        // A + B -> Exp1 + Exp2 -> 10 + 12 -> 22


    }
}
