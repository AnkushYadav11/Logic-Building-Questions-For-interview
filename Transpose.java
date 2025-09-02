public class Transpose {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("...Before Transpose...");
        for(int i=0;i<3;i++){
            System.out.print("[");
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("]");
            System.out.print("\n");
        }
        System.out.println("...After Tanspose...");
        for(int i=0;i<3;i++){
            System.out.print("[");
            for(int j=0;j<3;j++){
                System.out.print(arr1[j][i]+" ");
            }
            System.out.print("]");
            System.out.print("\n");
        }
    }
}
