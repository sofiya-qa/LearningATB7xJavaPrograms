package aug.ex_10082024.superthiskeyword;

public class Lab164 {

}

class Student extends Person{
    // isA relation - inheritance
    @Override
    void message(){
        System.out.println("I am student message");
    }

    void display(){
        super.message();
    }
}

class Person{
    void message(){
        System.out.println("I am person message");
    }
}