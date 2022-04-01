package updatedWeek7Programmes;

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {
        //numeric array declaration
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        //string array declaration
        String[] strArray = {"Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo" };
        System.out.println("Actual numerical array was " + Arrays.toString(numArray));
        //sorting the array
        Arrays.sort(numArray);
        System.out.println("sorted numerical array is " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("actual string array was " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("sorted string array is " + Arrays.toString(strArray));

    }
}
