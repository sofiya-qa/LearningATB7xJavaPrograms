package Aug2024.ex_04082024;

import java.util.Scanner;

public class Lab151 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Bank Balance!");
        int bal = sc.nextInt();
        System.out.println("Enter your Code of the Bank!");
        String bCode = sc.next();

        BankAccount bicici = new BankAccount(bName, bal, bCode);
        bicici.printDetails();
        sc.close();
    }
}
