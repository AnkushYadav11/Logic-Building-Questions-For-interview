public class Sumofgivennumber {
    public static void main(String[] args) {
        int n = 6;
        int count=0;
        int[] arr = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                int sum = arr[i] + arr[j];
                if(sum == n){
                    count++;
                    System.out.println(arr[i]+ " "+ arr[j]);
                }
            }
        }
        System.out.println("Numbers of pairs are:- "+count);
    }
}
