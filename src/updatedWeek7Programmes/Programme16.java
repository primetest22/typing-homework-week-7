package updatedWeek7Programmes;

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //Closing the scanner object
        s.close();
    }

    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number + " is ZERO");
        }
    }
}
