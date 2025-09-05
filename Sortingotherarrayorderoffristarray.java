import java.util.Arrays;

public class Sortingotherarrayorderoffristarray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,3,2,1};
        for(int i=0; i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                for(int x=0;x<arr2.length;x++){
                    for(int y=0;y<arr2.length;y++){
                        if(arr1[i] == arr2[y]){
                            int temp = arr2[x];
                            arr2[x] = arr2[y];
                            arr2[y] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("First Array is:- "+Arrays.toString(arr1));
        System.out.println("Second Sorted Array is:- "+Arrays.toString(arr2));
    }
}
