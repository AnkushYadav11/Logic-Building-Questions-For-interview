class Sec{
    public static void main(String[] args) {
    int[] arr  = {1,5,2,6,3,4};
    int max = arr[0];
    int secmax = arr[0];
 
    for(int i=1;i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    for(int j= 1 ; j<arr.length;j++){
        if(max > arr[j] && secmax <arr[j]){
            secmax = arr[j];
        }
    }     
    System.out.println("Max "+max + " secMax "+secmax);   
    } 
    }