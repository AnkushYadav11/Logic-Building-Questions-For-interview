import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,4,3,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){continue;}
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }
        for(int x= 0;x<arr.length-1;x++){
            if(arr[x] > arr[x+1]){
                int temp = arr[x];
                arr[x] = arr[x+1];
                arr[x+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
