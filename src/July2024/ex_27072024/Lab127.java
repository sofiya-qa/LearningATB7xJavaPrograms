package July2024.ex_27072024;

import java.util.Scanner;

public class Lab127 {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject
        // Figure inputs - float, scanner class

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the marks of the sub 1");
        marks[0] = sc.nextFloat();

        System.out.println("Enter the marks of the sub 2");
        marks[1] = sc.nextFloat();

        System.out.println("Enter the marks of the sub 3");
        marks[2] = sc.nextFloat();

        System.out.println("Enter the marks of the sub 4");
        marks[3] = sc.nextFloat();

        System.out.println("Enter the marks of the sub 5");
        marks[4] = sc.nextFloat();

        float avg = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4])/5;
        System.out.println("Avg is -> "+avg);


        sc.close();
    }
}
