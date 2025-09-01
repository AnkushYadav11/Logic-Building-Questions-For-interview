import java.util.Arrays;

class Conofarray{
    public static void main(String[] args){
        int[] arr1 = new int[9];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        int n = 3;
        
        int[] arr2 = {5,6,7,8,9,10};
        for(int i=0; i<arr2.length; i++){
            arr1[n+i] = arr2[i];
        }
        System.out.println("Concantination of two array is:- "+ Arrays.toString(arr1));
    }
}