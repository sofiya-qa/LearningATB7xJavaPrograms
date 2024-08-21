package aug.ex_17082024.exception_part1;

public class Lab190 {
    public static void main(String[] args) {
        try {
            String s1 = "Sofiya";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());
        }


        System.out.println("End of Program!");
    }
}
