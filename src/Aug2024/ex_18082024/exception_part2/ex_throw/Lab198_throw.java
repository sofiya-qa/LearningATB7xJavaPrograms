package Aug2024.ex_18082024.exception_part2.ex_throw;

public class Lab198_throw {
    public static void main(String[] args) {
        // throw
        // Custom Exception

        Bank sbi = new Bank("INR",10);

//        Bank icici = new Bank("INR",100);
//        Integer total = sbi.add(icici);
//        System.out.println(total);

        Bank jpMorgan = new Bank("USD", 900);
        Integer totalNew = sbi.add(jpMorgan);
        System.out.println(totalNew);
    }
}
