package aug.ex_18082024.exception_part2;

public class Lab202 {
    public static void main(String[] args) {
        String name = "Sofiya";
        String name2 = "sofiya";
        if (name.equalsIgnoreCase(name2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // final -> constant
        // finally -> block of code with try and catch
        // finalize -> Object class function - threading use case
    }
}
