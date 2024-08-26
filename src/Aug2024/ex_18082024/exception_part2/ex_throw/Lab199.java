package Aug2024.ex_18082024.exception_part2.ex_throw;

import java.util.Scanner;

public class Lab199 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        if( name.equalsIgnoreCase("Sofiya")){
            try {
                throw new Exception("Not allowed");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Allowed");
        }

    }
}
