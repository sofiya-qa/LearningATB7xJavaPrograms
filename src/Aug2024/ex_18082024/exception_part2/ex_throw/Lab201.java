package Aug2024.ex_18082024.exception_part2.ex_throw;

public class Lab201 {
    public static void main(String[] args) throws Exception {
        String s1 = null ;
        if (s1 == null) {
            throw new Exception("Add a proper String or not null String");
        }
        s1.trim();
    }
}
