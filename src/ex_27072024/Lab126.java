package ex_27072024;

public class Lab126 {
    public static void main(String[] args) {
        System.out.println(args.length);

        if (args.length > 0){
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }else {
            System.out.println("No Arguments given");
        }
    }
}
