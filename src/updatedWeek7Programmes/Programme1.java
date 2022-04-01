package updatedWeek7Programmes;

import java.util.Scanner;

public class Programme1 {


public static void main(String[] args) {
    //scanner declaration for reading input from console
    Scanner s = new Scanner((System.in));
    System.out.println("please enter the number");
    int number  = s.nextInt();
    isItOddOrEvenNumber(number);
    s.close();


}
//checking the number is ever or odd
public static void isItOddOrEvenNumber(int number) {

//ternary operator is used
String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
    System.out.println("the " + number + " is " + evenOrOdd + " number");


}
}
