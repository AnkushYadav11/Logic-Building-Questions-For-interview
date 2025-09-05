import java.util.Arrays;

public class Reverse{
    public void reverse(char[] c,int start,int end){
        for(int i=0;i<end;i++){
            for(int j=i;j<end;j++){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
        }
        System.out.println(Arrays.toString(c));
    }
    public static void main(String[] args) {
        String str = "Hello world";
        char[] c =str.toCharArray();
        Reverse r = new Reverse();
        int end = c.length;
        r.reverse(c,0,end);
    }
}