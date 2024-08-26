package Aug2024.ex_17082024.exception_part1.finallyblocked;

public class Lab191 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10/a;
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("div by Zero");
        } finally {
            System.out.println("Anyhow, I will be always executed.");
        }
    }
}
