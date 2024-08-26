package Aug2024.ex_24082024.ex_List;

public class Lab216 {
    public static void main(String[] args) {

        Person p1 = new Person("Sofiya", "KA");
        Person p2 = new Person("Pooja", "Delhi");
        System.out.println(p1);
        System.out.println(p2);
    }
}

class Person extends Object{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "ID -> " + name + ", Address -> " + address;
    }
}