package Aug2024.ex_24082024.ex_Generic;

public class Lab226_ex_Generic {
    public static void main(String[] args) {
        temp("Sofiya");
        temp(123);
        temp(true);

        sum(3,4);
        sum("sofiya", "ansari");

    }

    public static <sofi> sofi sum(sofi a, sofi b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    // T -> Any data type
    // Ref to the Data type that you want to use.
    // Instead of T we can use sofi, anything we can use
    // When we are not sure about which data type will come
    // then, we use " T " which is generic in nature

    public static <T>void temp(T name){
        System.out.println(name);
    }
}
