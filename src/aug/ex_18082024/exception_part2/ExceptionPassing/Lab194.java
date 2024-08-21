package aug.ex_18082024.exception_part2.ExceptionPassing;

public class Lab194 {
    public static void main(String[] args) {

        extracted();
    }

    private static void extracted(){

        extracted1();
    }
    private static void extracted1(){
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]);  // Unchecked - ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundsException");;
        }finally {

            // File.close, sc.close, sqlConnection.close
            System.out.println("End of the program");
        }
    }
}
