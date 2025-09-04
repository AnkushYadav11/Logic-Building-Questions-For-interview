import java.util.Arrays;

public class Zerotoend {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 3, 4, 0, 0, 5 };
        int i = 0;
        for (int j = i; j < arr.length; j++) {
           if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println("All Zero To end:- " + Arrays.toString(arr));
    }
}
