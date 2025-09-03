//Create a program that declares variables for length and breadth and calculates area & perimeter of a rectangle.
package Variable_Exercise;

public class VariablesExercise8 {
    public static void main(String[] args) {
        int length = 10, breadth = 5;
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        System.out.println("Area: " + area + ", Perimeter: " + perimeter);
    }
}
