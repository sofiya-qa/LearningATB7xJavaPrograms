package Aug2024.ex_10082024.polymorphism.methodoverridding;

public class Lab162 {

    // Method Overriding | Run Time Polymorphism | Dynamic Binding | Late Binding

    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_Ref = new Hound();
        dog_Ref.bark();  // Overriden Functions

        //dog_Ref.bike();
        // Hound h2 = new Dog();
    }
}
