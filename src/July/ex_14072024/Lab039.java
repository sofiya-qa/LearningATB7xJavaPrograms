package July.ex_14072024;

public class Lab039 {
    public static void main(String[] args) {

        // Increment (++) / Decrement (--) Operators
        // Pre and Post

        // Pre- increment
        // Value is incremented first and then stored in the result

//        int a = 10;
//        int b = ++a;  // a = a+1;
//        // Exp = 11 , a = 11
//
//        System.out.println(a);
//        System.out.println(b);

        int a = 10;
        System.out.println(++a);
        // Exp = 11 , a = 11

        // Post- increment
        // Value is stored in the result first and increment later

        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        // Exp = 10 , a = 11

    }
}
