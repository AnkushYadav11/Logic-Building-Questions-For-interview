import java.util.Arrays;

public class Rightrotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = n;
        System.out.println("Right Rotation is Array:- "+Arrays.toString(arr));
    }
}
