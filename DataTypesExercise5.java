//Declare a boolean variable `isEven` that checks whether a given number is even or not.
package Exercise;

public class DataTypesExercise5 {
    public static void main(String[] args) {
        int num = 12;
        boolean isEven = (num % 2 == 0);
        System.out.println("Is " + num + " even? " + isEven);
    }
}
