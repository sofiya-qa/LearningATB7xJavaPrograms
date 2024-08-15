package aug.ex_11082024.ex_Abstraction_Loan;

public class Lab167 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50K();

        Father f1 = new Son();
        f1.loan25K();
        f1.loan50K();
    }
}
