package ex_21072024;

public class Lab103 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50 ; i++) {  // i = 0 to 50, times = 51
            if( i % 2 == 0){
                System.out.println("Even -> " + i);
                continue; // Skipping the remaining program
              // break; -> Terminate the loop
            }
            System.out.println("Odd -> " + i);
        }
    }
}
