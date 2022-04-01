package updatedWeek7Programmes;

public class Programme11 {
    public static void main(String[] args) {
        System.out.println("number divisible by 3 are ");
        for(int i =1;i<=100;i++){
         divideByThree(i);
        }
        System.out.println("\n---------------------------------------------------------------------");
        System.out.println("number divisible by 5 are ");
        for(int j=1;j<=100;j++){
            dividedByFive(j);
        }
    }
    public static void divideByThree(int number){
        if(number%3==0){
            System.out.println(number + ",");
        }
    }
    public static void dividedByFive(int number){
        if(number%5==0){
            System.out.println((number + ","));
        }
    }
}
