package aug.ex_17082024.exception_part1;

public class Lab189 {
    public static void main(String[] args) {

        // Good coder exmaple
        System.out.println("Start of the program.");

        int b = 0;     // ArithmeticException
        try {
            String ip = args[0];  // ArrayIndexOutOfBoundsException

            int a = Integer.parseInt(ip);   // NumberFormatException
            b = 1000/a;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);

        System.out.println("End of the program.");

    }
}
