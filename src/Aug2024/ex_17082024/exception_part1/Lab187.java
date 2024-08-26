package Aug2024.ex_17082024.exception_part1;

public class Lab187 {
    public static void main(String[] args) {
        int c = 0;
        try {
            c = 10/0;

        } catch (Exception e) {
            System.out.println("Divide by zero, You fool !!");
        }
        System.out.println(c);
        System.out.println("End");
    }
}
