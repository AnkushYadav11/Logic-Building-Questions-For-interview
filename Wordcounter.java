public class Wordcounter{
    public static void wordCounter(String str){
        int count = 1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                count ++;
            }
        }
        System.out.println("Number of words in this sentence is:- "+count);
    }
    public static void main(String[] args) {
        Wordcounter w = new Wordcounter();
        String str = "Hello world i am abcd";
        wordCounter(str);
    }
}