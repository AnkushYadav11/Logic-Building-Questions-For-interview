public class Largestinarray {
    public static void main(String[] args) {
        int[] arr = {1,2,11,3,4,5,6};
        int n = arr[0];
        for(int i=0; i<arr.length;i++){
            if(n<arr[i]){
               n = arr[i];
            }
        }
        System.out.println(n);
    }
}
