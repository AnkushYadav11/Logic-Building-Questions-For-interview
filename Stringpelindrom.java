public class Stringpelindrom {
    public static void main(String[] args) {
        String str = "level";
        int i=0,j=str.length()-1;
        boolean isPelindrome = true;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                isPelindrome=false;
            }
            i++;
            j--;
        }
        if(isPelindrome){
            System.out.println("'"+str+"'"+" is a pelindrome.");
        }
        else{
            System.out.println("'"+str+"'"+" is Not a pelindrome.");
        }
    }
}
