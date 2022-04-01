package updatedWeek7Programmes;

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int x = s.nextInt();
        System.out.println("enter second number");
        int y = s.nextInt();
        System.out.println("enter symbol: + * / -");
        char symbol = s.next().charAt(0);
        doOperationBySelectingSymbol(x,y,symbol);
        //closing the scanner object
        s.close();
    }

    public static void doOperationBySelectingSymbol(int x, int y, char symbol){

        if(symbol=='+'){
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol=='-'){
            System.out.println((x + " - " + y + " = " + (x - y)));
        }  else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }
    }

