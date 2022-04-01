package updatedWeek7Programmes;

public class Programme20 {

    public static void main(String[] args) {
        int [] numArray = {10,20,30,40,50};
        System.out.println(isArrayContain(numArray, 50));
        System.out.println(isArrayContain(numArray, 10));

    }

    public static boolean isArrayContain(int[] arr, int item){
        boolean isContain = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                isContain=true;
                break;
            }
        }
        return isContain;
    }
}
