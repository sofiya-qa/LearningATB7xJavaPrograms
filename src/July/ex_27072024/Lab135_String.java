package July.ex_27072024;

public class Lab135_String {
    public static void main(String[] args) {
        // String - Bunch of Chars.

        String s1 = new String("Sofiya"); // Heap Area
        String s2 = "Sofiya"; // String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("f"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.replaceAll("Sofiya", "Ansari"));
    }
}
