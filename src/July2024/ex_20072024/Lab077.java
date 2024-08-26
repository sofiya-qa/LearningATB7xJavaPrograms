package July2024.ex_20072024;

public class Lab077 {
    public static void main(String[] args) {
        // JDK > 13

        char code = 'Z';
        int val = switch (code){
            case 'A':
                yield 65; /// Return in future
            case 'B':
                yield 66; /// Return
            default :
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
}
