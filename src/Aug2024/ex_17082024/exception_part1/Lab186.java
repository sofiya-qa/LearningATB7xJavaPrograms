package Aug2024.ex_17082024.exception_part1;

public class Lab186 {
    public static void main(String[] args) {
        // Exceptions
        // An exception is an event that occurs during the execution of a program
        // that disrupts the normal flow of instructions

        // Types of Exception
        // 1. Checked -> Compile Time -> JVM knows about it
        // 2. Unchecked -> Run Time -> JVM doesn't about it

        // Checked
//        try {
//            FileInputStream file = new FileInputStream("c://log.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        // Unchecked
        try {
            int a = 10;
            int c = a/0;    // ArithmeticException
            System.out.println("c");
        } catch (Exception e) {
            System.out.println("Error: Divide by Zero");
        }
        System.out.println("End of the program");
    }
}
