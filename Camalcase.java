public class Camalcase {
    public static void camalCase(String str){
        boolean isCamal = true;
        if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z'){
            isCamal = false;
        }
        else{
            for(int i=1;i<str.length();i++){
                if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'){
                    isCamal = true;
                    break;
                }
            }
        }

        if (isCamal) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
     public static void main(String[] args) {
        String str = "HelloWolrd";
        camalCase(str);
     }
}