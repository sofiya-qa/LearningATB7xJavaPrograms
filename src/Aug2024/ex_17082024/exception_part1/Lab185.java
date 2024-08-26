package Aug2024.ex_17082024.exception_part1;

public class Lab185 {
    public static void main(String[] args) {

        System.out.println("Start of the program.");
        String ip = args[0];  // ArrayIndexOutOfBoundsException

        int a = Integer.parseInt(ip);   // NumberFormatException
        int b = 1000/a;     // ArithmeticException
        System.out.println(b);
        System.out.println("End of the program.");

        // **** Program Flow *****
        // 1. JVM will be Initialized
        // 2. Creates and Starts the main Thread - Main Called
        // 3. Lab185.main(0)
        // 4. Now Control will be transferred from main Thread to main method
        // 5. When problem comes in main -> JVM
        // 6. If you don't handle the exception JVM -
        // 7. Exception a=new Exception() and terminate the program.







    }
}
