package Aug2024.ex_18082024.exception_part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab196_throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    private static void readFile() throws FileNotFoundException {
        String path = "C://a.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file); // read the file,
        // here txt file it can read
        System.out.println("End of the programs");
    }
}
