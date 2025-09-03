//Write a program that reads an integer from the user and converts it to a `double`
package Exercise;

import java.util.Scanner;

public class DataTypesExercise7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter an integer: ");
			int num = sc.nextInt(); // Reads an integer from user input
			double d = num; // Implicitly converts int to double
			System.out.println("Integer: " + num + ", Double: " + d);
		}
    }
}

