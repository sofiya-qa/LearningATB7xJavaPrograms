package Aug2024.ex_04082024;

public class ATBPerson {
    String name;
    long phone;

    // Default constructor
    ATBPerson(){
        System.out.println("Object is created");
    }

    // Parameterized constructor
    ATBPerson(String nameGiven) {
        this.name = nameGiven;
    }
    ATBPerson(String nameGiven, long phoneNumber) {
        this.name = nameGiven;
        this.phone = phoneNumber;
    }
}
