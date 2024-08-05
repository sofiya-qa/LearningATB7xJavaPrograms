package aug.ex_04082024;

public class Lab150 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.printDetails();

        System.out.println("------------------------------");

        BankAccount bicici = new BankAccount("ICICI", 100, "ICICI001");
        bicici.printDetails();

    }
}
