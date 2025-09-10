public class Sumofdigitsinstring {
    public static void sumOfDigits(String str){
        int sum = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >='0' && str.charAt(i)<='9'){
                int num = str.charAt(i);
                num -= 48;
                sum += num;
            }
        }
        System.out.println("Sum of Digits:- "+ sum);
    }
    public static void main(String[] args) {
        String str = "123b";
        sumOfDigits(str);
    }
}