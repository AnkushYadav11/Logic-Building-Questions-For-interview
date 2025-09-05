public class Vovelsinstring{
    public static void main(String[] args){
        String str = "Hello world";
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i) == 'A'|| str.charAt(i)=='e' || str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U'||str.charAt(i)=='e'||str.charAt(i)=='E'){
                count++;
                System.out.println(str.charAt(i)+" is Vovel.");
            }
        }
        System.out.println("There are "+count+" Vovels.");
    }
}