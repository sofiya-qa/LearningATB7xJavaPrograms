package Aug2024.ex_17082024.exception_part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab192 {
    public static void main(String[] args) {

        // Unchecked -> Arithmetic Exception
        try {
            int a = 10/0;
        }
        catch (Exception sofi) {
            System.out.println("Divide by zero");
           // sofi.getMessage();
        }

        // Checked -> FileNotFoundException
        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        }
        catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }

    }

}
