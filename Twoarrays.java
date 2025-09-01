import java.util.Arrays;

public class Twoarrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int size = arr1.length/2;
        int[] arr2 = new int[3];
        System.out.println(size);
        int j=0;
        for(int i= size; i<arr1.length;i++){
            System.out.println("I valus"+arr1[i]);
            arr2[j] = arr1[i];
            j++;
        }
        System.out.println("Old Array:- "+Arrays.toString(arr1));
        System.out.println("New Array:- "+Arrays.toString(arr2));
    }
}