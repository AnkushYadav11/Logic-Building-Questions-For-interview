public class Sumofarray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,50};
        int[] arr2 = {6,7,8,9,10};
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<arr1.length;i++){
            sum1 += arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            sum2 += arr2[j];
        }
        if(sum1>sum2){
            System.out.println("Array 1 is greater...");
        }
        else{
            System.out.println("Array 2 is greater...");
        }
    }
}
