public class Smallinleft {
    public static void main(String[] args) {
        int[] arr = {3,2,6,2,3,1};
        int n = arr.length/2;
        int i=arr[0];
            for(int j=0;j<n;j++){
                if(i>arr[j]){
                    i = arr[j];
                }
            }
        System.out.println("Smallest Number:- "+i);
    }
}
