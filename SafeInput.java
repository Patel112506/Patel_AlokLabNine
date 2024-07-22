import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // Clear the buffer
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("You must enter a value between " + low + " and " + high);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer: " + trash);
            }
        } while (!done);
        return retVal;
    }
}
