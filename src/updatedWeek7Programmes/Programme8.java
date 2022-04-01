package updatedWeek7Programmes;

import java.util.Scanner;

public class Programme8 {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner s = new Scanner(System.in);
        System.out.println("please enter alphabet between A to F");
        char city = s.next().charAt(0);
        //object creation
        Programme8 cityName = new Programme8();
        cityName.printCityName(city);
        //closing scanner
        s.close();
    }
    //printing city name
    public void printCityName(char city){
        if(city=='A' || city=='a'){
            System.out.println("Aberdeen");
        } else if (city=='B' || city=='b') {
            System.out.println("Belfast");
        } else if (city=='C' || city=='c'){
            System.out.println("Cambridge");
        } else if (city=='D' || city=='d'){
        System.out.println("Derby");
        } else if (city=='E' || city=='e') {
            System.out.println("Edinburg");
        } else if (city=='F' || city=='f'){
            System.out.println("feltham");
        }else {
            System.out.println("the alphabet you enter is not between a to f");
        }
    }

}
