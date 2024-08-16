package July.ex_21072024;

public class Lab111 {
    public static void main(String[] args) {
        // while, do while -?
        // do while - while -> 1 minor change

        // while loop
        //  int -> condition -> body -> increment / decrement

        // Do while loop
        // int -> body -> increment / decrement -> condition
        // Do always run 1 time

        int i = 1;
//        while (i>10){
//            System.out.println(i);
//            i++;
//        }
        do{
            System.out.println(i);
            i++;
        } while (i>10);
    }
}
