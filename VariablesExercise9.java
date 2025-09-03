//Declare a constant using `final` keyword and try reassigning it (observe the error).

package Variable_Exercise;

public class VariablesExercise9 {
    public static void main(String[] args) {
        final int SPEED = 60;
        System.out.println("Speed: " + SPEED);
        // SPEED = 80;  // ❌ Error: cannot assign a value to final variable
    }
}
