package July2024.ex_14072024;

public class Lab037 {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45F;
        //int total_price = course + GST; // Implicit Narrowing - JVM not allow

        int total_price = course + (int)GST; // Explicit v=narroing - real time -> Money loss

        System.out.println(total_price);
    }
}
