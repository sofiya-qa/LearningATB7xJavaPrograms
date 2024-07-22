package ex_21072024;

public class Lab102 {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {  // i = 0 to 9, times -> 10 times will run
            System.out.println(i);
            if( i == 5){
                continue; // Skipping the remaining program
            }
            System.out.println("After!!");
        }
    }
}
