public class Stringchecker {
    public static void main(String[] args) {
        String str1 = "Hello world world";
        String str2 = "Hello";
        int n =0;
        int a = 0;
        int count = 0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!= ' ' && i != str1.length()-1){
                n+=str1.charAt(i);
            }

            else if(i == str1.length()-1){
                count++;
                for(int j = 0; j<str2.length();j++){
                    a += str2.charAt(j);
                }
                if(n==a){
                    System.out.println("Yes "+str2 + " Present in "  + count + " string. \n"+str1);
                }
                else{
                    System.out.println(str2+" is not present in "+ count +" string. \n" + str1);
                }
            }
            else{
                count++;
                for(int j=0; j<str2.length();j++){
                    a += str2.charAt(j);
                }
                if(n==a){
                    System.out.println("Yes "+str2 + " Present in "  + count + " string. \n"+str1);
                }
                else{
                    System.out.println(str2+" is not present in "+ count +" string. \n" + str1);
                }
            }
        }
    }
}
