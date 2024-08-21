package aug.ex_17082024.enumclass;

public class Lab183 {
    public static void main(String[] args) {
       System.out.println("BUG value - "+ BUG.LOW);

       System.out.println("I am working on "+ PAGES.CHATBOTPAGE);

       System.out.println("Color Code "+ COLOR.RED);
       System.out.println("Color Code "+ COLOR.RED.getValue());

        System.out.println(APIConstants.LOGIN_PAGE);
        System.out.println(APIConstants.LOGIN_PAGE.getValue());
    }
}
