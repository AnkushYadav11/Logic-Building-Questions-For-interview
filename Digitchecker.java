public class Digitchecker {
    public static void main(String[] args) {
        String str = "12345b";
        char[] c = str.toCharArray();
        boolean isDigit = true;
        for(int i=0;i<c.length;i++){
            if(c[i] <= '0' || c[i] >= '9'){ 
                isDigit = false;
                break;
            }
        }
        if(isDigit){
            System.out.println("Yes all digits.");
        }
        else{
            System.out.println("No all are not digits.");
        }
    }
}
