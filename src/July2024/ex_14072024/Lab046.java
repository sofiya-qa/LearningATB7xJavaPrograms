package July2024.ex_14072024;

public class Lab046 {

    public static void main(String[] args) {

        String name = "Pramod";

        // String -> Bunch of Chars - Collection of Chars
        // class -> ?
        String name2 = new String("Sofiya");

        // How many ways we can a String -> 2 ways
        // =  new keyword
        // =  stored the value in "SCp" -> String Constant Pool
        // new -> Objects(heap) format

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name2.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name2.charAt(0));
        System.out.println(name.charAt(10)); // Error -> String index out of range: 10

    }
}
