import java.util.Arrays;

public class Medain {
    public static void conOfArray(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
        int i = arr3.length / 2;
        if (arr3.length % 2 == 0) {
            float a = arr3[i] + arr3[i - 1];
            float b = a/2;
            System.out.println("Median of 2 Arrays is:- " + b);
        } else {
            System.out.println("Median of 2 Arrays is:- " + arr3[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 5, 6, 7, 8 };
        conOfArray(arr1, arr2);
    }
}