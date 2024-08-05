package ex_27072024;

public class Lab136 {
    public static void main(String[] args) {
        // Strings are immutable in nature
        // StringBuilder, StringBuffer

        String s1 = "Sofiya";
        s1 = " Ansari";

        StringBuffer stringBuffer = new StringBuffer("Sofiya");
        // change the value of string - Buffer -> only 1 string are there
        stringBuffer.append("Ansari");  // Sofiya is replace by "SofiyaAnsari"
        stringBuffer.append("JI");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse().toString());

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        stringBuilder.append("JI");
        System.out.println(stringBuilder);

        // Thread Safety ?

        // Synchronized -> one by one process

    }
}
