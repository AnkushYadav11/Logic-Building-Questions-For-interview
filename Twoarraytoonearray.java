import java.util.Arrays;

public class Twoarraytoonearray {
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};
        int[] arr2 = new int[10];
        int n=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr2[++n] = arr1[i][j];
            }
        }
        System.out.println("New Array is:- "+Arrays.toString(arr2));
    }
}
