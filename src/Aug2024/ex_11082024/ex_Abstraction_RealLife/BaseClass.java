package Aug2024.ex_11082024.ex_Abstraction_RealLife;

abstract class BaseClass extends GrandBaseClass {
    // Web Automation
    // Single
    // Hide the Functionality of the open and close Browser.

    abstract String openBrowser(String browser);
    abstract String closeBrowser(String browser);

    @Override
    void takeScreenShot() {
        System.out.println("Ok Taking ScreenShot");
    }
}