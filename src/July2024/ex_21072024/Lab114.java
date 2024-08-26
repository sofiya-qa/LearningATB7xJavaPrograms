package July2024.ex_21072024;

public class Lab114 {
    public static void main(String[] args) {
        // Function -> Block of code which we can reuse.
        // Pre-built -> Math.max()
        // user created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        // Types of Functions
        // -> 4 important types of the functions based on the Parameter, Return (Parameters = Arguments)
        // 1. Without Parameters and without return type
        // 2. Without Parameters but with return type
        // 3. With Parameters and without return type
        // 4. With Parameters and with return type
        function_type1();

        System.out.println("-----------------------");

        String name = function_type2();
        System.out.println(name);

        System.out.println("----------------------");

        function_type3("Sofiya");
        function_type3("8767");

        System.out.println("-----------------------");

        int sum_result = function_type4(4,5);
        System.out.println("O/P -> "+sum_result);

    }

    // 1. Without Parameters and without return type
    static void function_type1(){
        System.out.println("1.. Without Parameters and without return type");
    }

    // 2. Without Parameters but with return type
    static String function_type2(){
        System.out.println("2. Without Parameters but with return type");
        return "Sofiya";
    }

    // 3. With Parameters and without return type
    static void function_type3(String name){
        System.out.println("3. With Parameters and without return type");
        System.out.println("You have shared -> " + name);
    }

    // 4. With Parameters and with return type
    static int function_type4(int a, int b){
        System.out.println(" 4. With Parameters and with return type");
        return a+b;
    }

}