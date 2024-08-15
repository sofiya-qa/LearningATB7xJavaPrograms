package aug.ex_11082024.ex_StaticKeyword;

// static
// block
// Data member
// Function
// Class

public class Lab173 {

    public static void main(String[] args) {
        System.out.println(ATB.courseName);

        ATB a1 = new ATB("sofiya");
        System.out.println(a1.getName());

        System.out.println("---------- ----------------");

        ATB a2 = new ATB("javed");
        System.out.println(a2.getName());

        ATB.doAssignment();

    }

}


    class ATB{

        {
            System.out.println("IIB");
            // What is the purpose? -
            // Here you can write code related to
            // start a website or anything before starting the
            // web automation or api automation
            //
            System.out.println("Reading from CSV file");
        }

        static{
            System.out.println("Load the class? I will execute the ");
        }

        private String name;
        private String phone;
        static String courseName = "ATB";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ATB(String name) {
            this.name = name;
        }

        static void doAssignment(){
            System.out.println("Do Assignment...!");
        }

        static class A {

        }
    }


