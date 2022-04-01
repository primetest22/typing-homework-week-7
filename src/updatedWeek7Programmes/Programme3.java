package updatedWeek7Programmes;

import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner s = new Scanner((System.in));
        System.out.println("\nEnter student name   \t \t:\t");
        String name = s.next();
        System.out.println("Enter student roll number \t\t:\t");
        int rollNum = s.nextInt();
        System.out.println("enter marks maths \t:\t");
        int mathsMarks = s.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\ninvalid input, marks should between 0 to 100");
            System.out.println("\nplease enter correct marks\t\t: \t");
            mathsMarks = s.nextInt();
        }
        System.out.println("enter marks for science\t:\t");
        int scienceMarks = s.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\ninvalid input, marks should between 0 to 100");
            System.out.println("\nplease enter correct marks\t\t:\t");
            scienceMarks = s.nextInt();
        }
        System.out.println("enter marks for english\t:\t");
        int enlishMarks = s.nextInt();
        if (enlishMarks < 0 || enlishMarks > 100) {
            System.out.println("\ninvalid input marks should between 0 to 100");
            System.out.println("\n please enter correct marks\t\t:\t");
            enlishMarks = s.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, enlishMarks);
        int percentage = (total * 100) / 300;
        String result = calulateResult(mathsMarks, scienceMarks, enlishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, enlishMarks, total, percentage, result, grade);

        //closing scanner object
        s.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the result on subject marks
    public static String calulateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "fail";
        } else {
            return "pass";
        }
    }

    //calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if(result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    //printing mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}
