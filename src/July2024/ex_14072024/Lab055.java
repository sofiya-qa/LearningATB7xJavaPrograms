package July2024.ex_14072024;

public class Lab055 {
    public static void main(String[] args) {

        String s1 = "Sofiya";

        // String s1 = "S o f i y a";
        //             |0|1|2|3|4|5|

        char c = s1.charAt(5);
        System.out.println(c);

        s1.concat("Ansari");
        System.out.println(s1);

        s1 = s1.concat("Ansari");  // SofiyaAnsari
        System.out.println(s1);
    }
}
