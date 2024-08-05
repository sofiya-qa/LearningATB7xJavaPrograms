package ex_28072024;

public class Lab139 {
    public static void main(String[] args) {

        // Class -> Attribute/Properties -> data types - primitive or non-primitive
        // Class -> Behaviour/Methods -> functions

        // Object -> Real entity which is created from a class
        // ClassName classRef = new ClassName();

        // new ClassName();    -> Object
        // classRef            -> Class Reference
        // ClassName           -> Class Name which blueprint you are using

        Lab139_BuildingBP dlf = new Lab139_BuildingBP();
        dlf.name = "DLF Pvt Builder";
        dlf.noOfRooms = 100;

        dlf.useLift();

        Lab139_BuildingBP prestige = new Lab139_BuildingBP();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;
    }
}
