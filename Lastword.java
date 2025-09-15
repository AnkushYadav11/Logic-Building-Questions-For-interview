public class Lastword {
    public static void main(String[] args) {
        String str = "Hello world";
        for(int i=str.length()-1;i> 0 ;i--){
            if(str.charAt(i) == ' '){
                System.out.println(i);
                break;
            }
        }
    }
}
