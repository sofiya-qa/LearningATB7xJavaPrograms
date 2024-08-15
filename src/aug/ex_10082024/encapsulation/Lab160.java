package aug.ex_10082024.encapsulation;

public class Lab160 {
    public static void main(String[] args) {

        ICICIBANK sofiya = new ICICIBANK("sofiya", 100);

        // Set the balance
        sofiya.setBal(100000000, false); // Not allowed
        System.out.println(sofiya.getName());
        System.out.println(sofiya.getBal(false));

        System.out.println("----------------- ------------------");

        // Write a code to connect with mySQL
        // Admin

        boolean are_you_admin = true;

        ICICIBANK admin = new ICICIBANK("admin", 1000);
        admin.setBal(5000000, true);  // It is allowed
        System.out.println(admin.getName());
        System.out.println(admin.getBal(are_you_admin));
    }
}
