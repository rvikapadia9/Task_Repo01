//Swap two numbers using a temporary `int` variable.
package Exercise;

public class DataTypesExercise6 {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a + " b=" + b);
    }
}
