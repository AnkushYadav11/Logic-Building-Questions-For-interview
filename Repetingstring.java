public class Repetingstring {
    public static void main(String[] args) {
        String str = "Hello world";
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i)+" Found "+count+" Times.");
            count=0;
        }

    }
}
