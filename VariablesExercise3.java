//Write a program that swaps two variables without using a third variable.
package Variable_Exercise;

public class VariablesExercise3 {
    public static void main(String[] args) {
        int a = 55, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }
}
