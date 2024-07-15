package ex_14072024;

public class Lab033 {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 23;
        //byte c = a+b;

        int c = a+b;

        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        //char c1 = a1+b1;
        int c1 = a1+b1; // AB -> char
        System.out.println(c1); //(65+66)

        System.out.println('A' == 65); // Compare ASCII value it will return true
        System.out.println('B' == 69); // o/p: false -> ASCII value of B is 66

    }
}
