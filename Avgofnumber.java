public class Avgofnumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        } 
        double avg = (double) sum / arr.length;
        System.out.println("Avg is:- "+avg);
    }
}
