package aug.ex_11082024.ex_Abstraction_RealLife;

public class Chrome extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome -> This is code related to chrome only");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Close the Chrome -> This is code related to chrome only");
        return "";
    }
}
