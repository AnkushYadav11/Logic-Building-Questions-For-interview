import java.util.Arrays;

public class Strarray {
    public static void main(String[] args) {
        String str = "Hello world"; // 11
        int count = str.length();
        String[] str_arr = new String[2];
        int index = 0;
        String temp = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ' && i != str.length()-1){
                temp += str.charAt(i);
            }
            else if(i == str.length()-1){
                str_arr[index] = temp;
                temp = "";
            }
            else{
                str_arr[index] = temp;
                temp = "";
                index++;
            }
        }
        System.out.println(Arrays.toString(str_arr));
    } 
}
