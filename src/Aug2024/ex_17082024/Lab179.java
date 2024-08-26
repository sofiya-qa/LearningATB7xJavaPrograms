package Aug2024.ex_17082024;

public class Lab179 {
    public static void main(String[] args) {
        APIAutomation api = new APIAutomation();

        // SBI -> call 1 time
        // IIB -> call when object is created
    }
}

class APIAutomation{

    static {
        // write a code to load the data from the MySQL
        System.out.println("Loaded data from the MySQL");
    }

    {
        // write a code to load the data from the CSV file
        System.out.println("Loaded data from the CSV");
    }

}
