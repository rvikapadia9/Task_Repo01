//Store the marks of 5 subjects in `float` variables and calculate the average.
package Exercise;

public class DataTypesExercise8 {
    public static void main(String[] args) {
        float sub1 = 85.5f, sub2 = 90.0f, sub3 = 76.5f, sub4 = 88.0f, sub5 = 92.5f;
        float avg = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
        System.out.println("Average marks: " + avg);
        int i=(int)avg;
        System.out.println(i);
    }
}
