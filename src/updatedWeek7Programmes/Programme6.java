package updatedWeek7Programmes;

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = s.nextInt();
        Programme6 oddEven = new Programme6();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
        // Closing the scanner object
        s.close();
    }

    // Checking the odd or even
    public String isItEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
