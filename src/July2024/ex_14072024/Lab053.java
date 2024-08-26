package July2024.ex_14072024;

public class Lab053 {
    public static void main(String[] args) {

        String name = "The Testing Academy"; // SCP
        String name1 = "The Testing Academy"; // SCP

        System.out.println(name == name1); // Check for the Reference
        System.out.println(name.equals(name1)); // check for the Content

        String name2 = new String("The Testing Academy"); // Heap are

        System.out.println(name == name2); // Check for the Reference
        System.out.println(name.equals(name2)); // check for the Content
    }
}
