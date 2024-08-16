package July.ex_14072024;

public class Lab054 {
    public static void main(String[] args) {

        String s1 = new String("Sofiya");
        String s2 = new String("Sofiya");
        String s3 = new String("Sofiya");

        System.out.println(s1 == s2); // Check for the Reference
        System.out.println(s2 == s3); // Check for the Reference

        System.out.println(s2.equals(s3)); // Check for the Content

    }
}
