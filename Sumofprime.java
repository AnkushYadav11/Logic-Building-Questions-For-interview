import java.util.*;
class Sumofprime{
	public static boolean isPrime(int n){
	for(int i=2;i<=n;i++){
		if(n%i==0){
			return false;
		}
		else{
			return true;
		}
	}
	}
public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Sumofprime o = new Sumofprime();
		System.out.println("Enter Your number:-");
		int n = s.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++){
			if(isPrime(i)){
				sum +=i;
			}
		}
		System.out.println("Sum Of Prime Numbers is:-"+sum);
	}
}