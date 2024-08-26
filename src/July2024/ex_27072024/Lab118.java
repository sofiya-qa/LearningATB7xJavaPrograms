package July2024.ex_27072024;

import java.util.Scanner;

public class Lab118 {
    public static void main(String[] args) {

        // Arrays -> new

        int[] marks = new int[3];
        // index -> 0,1,2
        // length -> 3

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        // System.out.println(marks[10]); // Error will throw -> ArrayIndexOutOfBoundsException

        boolean[] is_married = {true, false, true};

        // How to print?? Traverse an array

        for (int i = 0; i < marks.length; i++) {

            // i = 0,1,2
            System.out.println(i +" -> "+marks[i]);

            String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
            for (int j = 0; j < weekDays.length; j++) {
                System.out.println(weekDays[j]);

            }
        }
    }
}
