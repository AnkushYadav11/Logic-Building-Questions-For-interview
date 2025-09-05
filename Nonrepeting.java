import java.util.Arrays;

public class Nonrepeting{
    public static void main(String[] args) {
        String str = "Hello World";
        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i] == c[j]){
                    c[i] = ' ';
                }
            }
        }
        System.out.println(Arrays.toString(c));
        for(int x = 0 ;x<c.length;x++){
            if(c[x] != ' '){
                System.out.println(c[x]);
                break;
            }
        }
    }
}