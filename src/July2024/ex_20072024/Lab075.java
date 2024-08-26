package July2024.ex_20072024;

public class Lab075 {
    public static void main(String[] args) {
        // JDk > 13

        int itemcode = 5;
        switch (itemcode){
            case 001,002,003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is Mechanical Gadget!");
                break;
            default:
                System.out.println("Nonex");
        }
    }
}
