import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Enter Your number to be search:- ");
        int x = s.nextInt();
        int a=0,b=0;
        for(int i=0;i<3;i++){
            System.out.print("[");
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
                if(arr[i][j] == x){
                    a = i;
                    b = j;
                } 
            }
            System.out.print("]");
            System.out.print("\n");
        }
        System.out.println("Number found at "+a+" row "+b+" column");
    }
}
