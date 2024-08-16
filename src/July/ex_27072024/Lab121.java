package July.ex_27072024;

public class Lab121 {
    public static void main(String[] args) {
        final int[] ages = new int[4]; // here final keyword fixed the length of array not the content
        // final

        ages[3] = 78;
        System.out.println(ages[3]);

        final int a = 10;
        // a = 90; -> This is not possible, here final keyword is not change the single value
    }
}
