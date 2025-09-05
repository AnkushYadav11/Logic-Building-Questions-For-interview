public class Parentheses {
    public static void main(String[] args) {
        String str = "( Hello ) {world} , [.] ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '{' || str.charAt(i) == '}' || str.charAt(i) == '[' || str.charAt(i) == ']'){
                System.out.println("on index "+ i + " "+ str.charAt(i)+ " parenthese found.");
            }
        }
    }
}
