import java.util.Arrays;

public class Splitstring {
    public static void main(String[] args) {
        String str = "Hello world";
        int index = 0;
        String n = "";
        String[] str_arr = new String[index];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' ' || i != str.length()-1){
                n += str.charAt(i);
                System.out.println(n);
            }
            else if(i == str.length()-1){
                n += str.charAt(i);
                str_arr[index] = n;
                index++;
                n="";
            }
            else if (str.charAt(i) == ' '){
                n += str.charAt(i);
                str_arr[index] = n;
                index++;
                n="";
            }
        }
        System.out.println(Arrays.toString(str_arr));
    }
}