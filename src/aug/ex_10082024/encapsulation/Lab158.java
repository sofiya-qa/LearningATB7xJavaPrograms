package aug.ex_10082024.encapsulation;

// ## Encapsulation
public class Lab158 {
    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin("admin", "password123");
        System.out.println(vwoLogin.password);

        vwoLogin.password = "123";
        System.out.println(vwoLogin.password);

    }
}

class VWOLogin{

    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
