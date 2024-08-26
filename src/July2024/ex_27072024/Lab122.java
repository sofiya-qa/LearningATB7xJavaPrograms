package July2024.ex_27072024;

public class Lab122 {
    public static void main(String[] args) {
        final float pi = 3.14f;

        // Disadvantage of array
        // 1. Fixed Data Type (homogenizes)
        // 2. Fixed Length
        // 3. Wastage of memory

        int[] ages = new int[100];
        ages[1] = 99;
        ages[1] = 100; // We can change the value in array
        System.out.println(ages[1]); // 0 99 0 0 0 0 0 0 0 0 0 . . . . . .
    }
}
