import java.util.Arrays;

public class Sortchar {
    public static void main(String[] args) {
        String str = "Hello world";
        char[] c = str.toCharArray();
        for(int i=0;i<c.length-1;i++){
            if(c[i]<c[i+1]){
                char temp = c[i];
                c[i]=c[i+1];
                c[i+1]=temp;
            }
        }
        System.out.println("Sorted string is:- "+Arrays.toString(c));
    }
}
