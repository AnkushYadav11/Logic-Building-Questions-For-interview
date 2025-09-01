import java.util.Arrays;

public class Sumofodd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        for(int i=0 ; i<arr.length; i++){
            if(arr[i]%2 != 0){
                sum += arr[i];
            }
        }
        System.out.println("Array "+ Arrays.toString(arr));
        System.out.println("Sum Of all Odd Numbers:- "+sum);
    }
}
