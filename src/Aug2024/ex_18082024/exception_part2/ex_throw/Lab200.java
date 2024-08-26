package Aug2024.ex_18082024.exception_part2.ex_throw;

import java.util.Scanner;

public class Lab200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if ( x==0 ) {
            throw new ArithmeticException("Enter non zero number");
        }
        try {
            int a = 10/x ;
            System.out.println(a);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
