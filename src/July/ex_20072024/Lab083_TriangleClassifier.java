package July.ex_20072024;

public class Lab083_TriangleClassifier {
    public static void main(String[] args) {
       // Triangle Classifier:

        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, 
        // determine if the triangle is equilateral (all sides are equal), 
        // isosceles (exactly two sides are equal), 
        // or scalene (no sides are equal). 
        // Use an if-else statement to classify the triangle.

        int side1 = 10;
        int side2 = 30;
        int side3 = 20;
        
        if ( side1 == side2 && side2 == side3){
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
