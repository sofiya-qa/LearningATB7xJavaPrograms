package ex_27072024;

public class Lab117 {
    public static void main(String[] args) {

        int[] marks_10_borad = {90, 91, 95, 99, 100,78};
        // elements are fixed.
        // len -> 6
        // who index - 3 -> 99


        System.out.println(marks_10_borad.length);
        System.out.println(marks_10_borad[3]); // 99
        System.out.println(marks_10_borad[0]); // 90
       // System.out.println(marks_10_borad[-1]); // ArrayIndexOutOfBoundsException
        System.out.println(marks_10_borad[10]);
    }
}
