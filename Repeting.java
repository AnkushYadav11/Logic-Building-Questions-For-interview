public class Repeting {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,2,4};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){continue;}
            for(int j=i+1;j<arr.length;j++){
                 if(arr[i] == arr[j]){
                    count++;
                    arr[j] = 0;
                 }
            }
            System.out.println(arr[i]+" is found "+count+" times.");
            count = 0;
        }
    }
}
