import java.util.*;

public class Rotatearray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Your Array Length:-");
        int len = s.nextInt();
        int[] arr = new int[len];
        
        System.out.println("Enter Your Array Elements:- ");
        for(int y=0; y<len; y++){
            System.out.print("Enter Your "+y+"th Elements:-");
            int element = s.nextInt();    
            arr[y] = element;
        }
        
        System.out.println("Enter Number of Times array will rotate:-");
        int d = s.nextInt();

        int n;
        for (int x = 0; x < d; x++) {
            n = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = n;
            System.out.println("Rotated Array to Left " + Arrays.toString(arr));
        }
    }
}
