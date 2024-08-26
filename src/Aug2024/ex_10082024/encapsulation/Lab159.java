package Aug2024.ex_10082024.encapsulation;

// ## Fixed Encapsulation
public class Lab159 {
    public static void main(String[] args) {

        VWOLogin1 vwoLogin1 = new VWOLogin1("admin", "password123");
        System.out.println(vwoLogin1.getUsername());

        vwoLogin1.setUsername("Sofiya");
        System.out.println(vwoLogin1.getUsername());

        // Write a code to Authenticate
        // Sofiya -> isAuth = true

        vwoLogin1.setPassword("1234", true);
        //vwoLogin1.setPassword("1234", false);
        System.out.println(vwoLogin1.getPassword());
    }
}

class VWOLogin1 {
// Data Members
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth){
            this.password = password;
            System.out.println("Allowed");
        }else{
            System.out.println("Not Allowed");
        }
    }

    public VWOLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
