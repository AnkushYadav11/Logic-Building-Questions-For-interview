import java.util.*;

class Sumofprime{

public static boolean isPrime(int n){
for(int i=2;i<=n;i++){
if(n%i==0){
return false;
}
}
return true;
}
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int sum =0;
System.out.println("Enter Your Number:-");
int num = s.nextInt();
for(int i=1;i<num;i++){
if(isPrime(i)){
sum +=1;
}
}
System.out.println("Sum of prime Numbers:- "+sum);
}
}
