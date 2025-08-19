import java.util.*;
class Decimal{
	static int count,decimal,val,n=2; 
	public static void logic(int num){
		while(num!=0){
			int rem = num % 10;
			val = rem * 1;
			if(count >= 1){
				for(int i=1;i<=count-1;i++){
					n *= 2;
				}
				val = rem * n; 
				n=2;
			}
			decimal += val;
			count++;
			num /=10;
		}
		System.out.println("Decimal Number is:- "+decimal);
	}

public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Your Binary Number:-");
	int num = s.nextInt();
	logic(num);
}
}
