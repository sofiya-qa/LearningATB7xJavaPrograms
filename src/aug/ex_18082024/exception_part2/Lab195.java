package aug.ex_18082024.exception_part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab195 {
    public static void main(String[] args) {
        String path = "C://a.txt";
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("FNFE");
        } catch (Exception e){
            System.out.println("End");
        }
    }
}
