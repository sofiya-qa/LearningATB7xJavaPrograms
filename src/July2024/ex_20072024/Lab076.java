package July2024.ex_20072024;

public class Lab076 {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode = 003;

        switch (itemcode){
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Hello!");
        }
    }
}
