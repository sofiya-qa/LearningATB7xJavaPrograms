package Aug2024.ex_04082024.multilevelinheritance.real;

public class TestCase2 extends BaseTest {

    void testCase2(){

        startBrowser(); // BaseTest
        getDataFromSQL();   // GrandBaseTest
        System.out.println(gold);
        // Here we will write the TC
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}