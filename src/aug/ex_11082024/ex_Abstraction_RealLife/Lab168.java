package aug.ex_11082024.ex_Abstraction_RealLife;

public class Lab168 {
    public static void main(String[] args) {
        Chrome c1 = new Chrome();
        c1.openBrowser("Chrome");
        c1.closeBrowser("Chrome");

        System.out.println("----------- --------------------");
        
        FireFox f1 = new FireFox();
        f1.openBrowser("FF");
        f1.closeBrowser("FF");
        f1.takeScreenShot();
    }
}
