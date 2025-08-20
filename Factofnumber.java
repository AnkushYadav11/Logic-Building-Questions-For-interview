import java.util.*;
class Factofnumber{
	public static int sum(int n){
		if(n==1){
			return  1;
		}
		return n * sum(n-1);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Number:-");
		int n = s.nextInt();
		int result = sum(n);
		System.out.println(result);
	}
}
