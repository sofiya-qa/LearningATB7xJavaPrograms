package Aug2024.ex_04082024.multilevelinheritance;

public class Lab154 {
    public static void main(String[] args) {
        // Multi Level
        // GF -> F -> Child

        Child c1 = new Child();
        c1.home();  // If name is same then priority will be Child -> Father -> Grandfather

        c1.c();
        c1.f();
        c1.gf();
    }
}
