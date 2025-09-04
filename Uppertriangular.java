public class Uppertriangular {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr1.length;i++){
            System.out.print("[");
            for(int j=0;j<arr1.length;j++){
                if(i>j){
                    arr1[i][j]=0;
                }
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("]\n");
        }
    }
}