import java.util.*;
public class Stringanagram {
    public static void main(String[] args) {
        String str1 = "anish";
        String str2 = "nisha";
        boolean isAna = true;
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        if(c1.length == c2.length){

            for(int i=0;i<c1.length;i++){
                for(int j=0;j<c1.length-1;j++){
                if(c1[j]<c1[j+1]){
                    char temp = c1[j];
                    c1[j] = c1[j+1];
                    c1[j+1] = temp;
                }
                if(c2[j]<c2[j+1]){
                    char temp = c2[j];
                    c2[j] = c2[j+1];
                    c2[j+1] = temp;
                }
            }
        }

            System.out.println(Arrays.toString(c1));
            System.out.println(Arrays.toString(c2));
            
            for(int x=0;x<c1.length;x++){
                if(c1[x] != c2[x]){
                    isAna = false;
                }
            }
            if(isAna){
                System.out.println("It is an anagram word.");
            }
            else{
                System.out.println("It is not an anagram word.");
            }
        }
        else{
            System.out.println("Array of frist array and second array is not same in size.");
        }
    }
}