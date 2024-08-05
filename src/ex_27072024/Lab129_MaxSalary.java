package ex_27072024;

import java.util.Arrays;

public class Lab129_MaxSalary {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary in the Salary Array
        // Infosys -> Automation Interview question
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int max = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
        }
        System.out.println(max);

        // Sort -> find the last one - which is the biggest one
//        Arrays.sort(salaries);
//        System.out.println(salaries[salaries.length-1]);
    }
}
