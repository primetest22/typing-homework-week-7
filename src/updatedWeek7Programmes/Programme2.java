package updatedWeek7Programmes;

import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
    //scanner declaration for reading input from console
        Scanner s = new Scanner(System.in);
        System.out.println("please ente the year");
        int year = s.nextInt();
        Programme2 leapYear = new Programme2();
        leapYear.isItLeapYear(year);
         //closing the scanner object
        s.close();
    }

    //checking is it leap year or not
    public void isItLeapYear(int year){
        if(year % 4 == 0 && year % 100!=0 || year % 400 ==0){
            System.out.println("the year " + year + " is leap year");
            return;
        }
        System.out.println("the year " + year + " is not a leap year");
    }

}
