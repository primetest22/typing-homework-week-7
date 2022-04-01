package updatedWeek7Programmes;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = s.next().toUpperCase();
        //Create object and call instance method
        Programme9 cityName = new Programme9();
        cityName.printCityName(city);
        //Closing the scanner object
        s.close();
    }

    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }

}
