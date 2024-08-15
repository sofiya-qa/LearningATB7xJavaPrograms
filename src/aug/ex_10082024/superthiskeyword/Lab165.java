package aug.ex_10082024.superthiskeyword;

public class Lab165 {

    // super.variable
    // super.method()
    // super() -> DC
    // super("pramod') -> PC

    // this()
    // this.variableName
}

class Person1{
    public Person1() {

        System.out.println("Person1 - DC");
    }

    public Person1(String a) {
        System.out.println("Person1 - PC A1");
    }

    public Person1(String a, int a1) {
        System.out.println("Person1 - PC A2");
    }
}

class Student1 extends Person1{
    int a = 10;

    Student1(String s) {
         System.out.println("PC - Student");
    }

    Student1() {
         //this("ansari");
         super();
         System.out.println(this.a);
        //  super("Sofiya");
       // super("Sofiya", 12);
    }
}