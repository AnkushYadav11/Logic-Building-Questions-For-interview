public class Smallesinarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr[0];
        for(int i=0;i<arr.length;i++){
            if(n>arr[i]){
                n = arr[i];
            }
        }
        System.out.println("Smallest number if array:- "+n);
    }
}
