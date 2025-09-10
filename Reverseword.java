import java.util.Arrays;

public class Reverseword{
    public static void reverse(char[] c,int start,int end){
        for(int i=start ;i<end;i++){
            for(int j=i;j<end;j++){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
            }
        }
        System.out.println(Arrays.toString(c));
    }
    public static void main(String[] args) {
        String str = "Hello word."; 
        char[] c =str.toCharArray();
        int start = 0;
        reverse(c,0,c.length);
        
        for(int end =0; end<c.length;end++){
            if(c[end] == ' '){
                reverse(c, start, end);
                start = end+1;
            }
            
            else if(end == c.length-1){ 
                reverse(c, start, end+1); 
            }
        }
    }
}