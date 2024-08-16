package July.ex_14072024;

public class Lab057 {
    public static void main(String[] args) {

        String password = "Sofiya@123";
        String pass_u = password.toLowerCase();

        // pass_u == password

        System.out.println(pass_u == password);  // o/p -> false
        System.out.println(pass_u.equals(password)); // o/p -> false

        System.out.println(pass_u.equalsIgnoreCase(password)); // o/p -> true

        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf('i'));
        System.out.println(password.length());

    }
}
