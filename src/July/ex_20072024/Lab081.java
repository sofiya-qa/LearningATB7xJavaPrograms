package July.ex_20072024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        // Program to find the largest between three numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2");
        int num2 = sc.nextInt();

        System.out.println("Enter the num3");
        int num3 = sc.nextInt();

        // num1 > num2 && num1 > num3 -> num1
        // num2 > num1 && num2 > num3 -> num2
        // num3

        if (num1 > num2 && num1 > num3 ){
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

    }
}
