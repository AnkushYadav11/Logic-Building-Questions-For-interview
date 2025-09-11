import java.util.Arrays;

public class Replacingword {
    public static void main(String[] args) {
        String str = "Hello world.";
        char[] c = str.toCharArray();
        char old_w = 'H';
        char new_w = 'E';
        for(int i=0;i<c.length;i++){
            if(c[i] == old_w){
                c[i] = new_w;
            }
        } 
        System.out.println(Arrays.toString(c));
    }
}
