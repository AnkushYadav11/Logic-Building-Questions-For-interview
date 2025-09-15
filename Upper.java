import java.util.Arrays;

public class Upper {
    public static char upperCase(char ch){
        if(ch >= 'a' && ch <= 'z'){
            int num = ch;
            ch = (char) (num-32);
        }
        return ch;
    }

    public static char lowerCase(char ch){
        if(ch >= 'A' && ch <='Z'){
            int num = ch;
            ch = (char) (num+32);
        }
        return ch;
    }

   public static void main(String[] args) {
    String str = "hello world";
    char[] ch = str.toCharArray();
    for(int i=0;i<ch.length;i++){
        ch[i] = upperCase(ch[i]);
    }
    System.out.println(Arrays.toString(ch));

    for(int i=0;i<ch.length;i++){
        ch[i]=lowerCase(ch[i]);
    }
    System.out.println(Arrays.toString(ch));

} 
}
