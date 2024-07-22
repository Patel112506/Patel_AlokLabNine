import java.util.Random;
import java.util.Scanner;

public class Lab_Nine {

    public static void main (String[] args) {
        // Task 1: Declare an array of type int named dataPoints
        int[] dataPoints = new int[100];

        // Task 2: Initialize each element to a random value between 1 and 100
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display the dataPoints values
        for (int val : dataPoints) {
            System.out.print(val + " | ");
        }
        System.out.println();

        // Task 4: Calculate the sum and the average of the values in dataPoints
        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the dataPoints array is: " + sum);
        System.out.println("The average of the dataPoints array is: " + average);

        // Task 5: Input a value from the user
        Scanner in = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(in, "Enter a value between 1 and 100: ", 1, 100);

        // Task 6: Count how many times the user's value is found within the array
        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " appears " + count + " times in the array.");

        // Task 7: Find the first occurrence of the user's value
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        // Task 8: Find the minimum and maximum values in the array
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int val : dataPoints) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Task 9: Calculate and display the average using a static method
        double staticMethodAverage = getAverage(dataPoints);
        System.out.println("Average of dataPoints using static method is: " + staticMethodAverage);
    }

    // Static method to calculate the average
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}
