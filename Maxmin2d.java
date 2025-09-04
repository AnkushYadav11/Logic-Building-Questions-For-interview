public class Maxmin2d {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int a = arr[0][0];
        int b = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>a){
                    a = arr[i][j];
                }
                else if(arr[i][j]<b){
                    b = arr[i][j];
                }
            }
        }
        System.out.println("Maximum:- "+a);
        System.out.println("Minumum:- "+b);
    }
}
