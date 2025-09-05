import java.util.Arrays;

public class Cap {
    public static void main(String[] args) {
        String str = "hello world";
        char[] c = str.toCharArray();
        int start = 0;
        for(int end=0;end<c.length;end++){
            if(c[end] == ' '){
                c[start] = 'H';
                c[end-1] = 'O';
                start = end+1;
            }
            else if(end == c.length-1){
                c[start] = 'W';
                c[end] = 'D';
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
