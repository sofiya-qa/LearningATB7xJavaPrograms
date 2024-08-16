package July.ex_27072024;

public class Lab130_MinimumSalary {
    public static void main(String[] args) {
        // Find the Min in the Arrays
        // Find the Min Salary in the Salary Array
        // Infosys -> Automation Interview question
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] < min) {
                min = salaries[i];
            }
        }
        System.out.println(min);


    }
}
