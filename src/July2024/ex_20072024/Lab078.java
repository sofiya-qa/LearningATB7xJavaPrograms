package July2024.ex_20072024;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your salary");
        double sal = sc.nextDouble();

        System.out.println("Your details are" + name);
        System.out.println("Your age is" + age);
        System.out.println("Your salary is " + sal);

        sc.close();
    }
}
