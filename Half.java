import java.util.Arrays;

public class Half {
    public static void main(String[] args) {
        int[] arr = {10,4,7,2,8,3,6,9,1,5};
        int n = arr.length/2;
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int x=arr.length-1; x >= n; x--){
            for(int y = x-1; y>=n;y--){
                if(arr[x]>arr[y]){
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
        System.out.println("Current Array is:-"+ Arrays.toString(arr));
    }
}
