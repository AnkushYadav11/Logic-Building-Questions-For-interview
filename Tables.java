import java.util.*;
class Tables{
	int table = 0;
	public void table(int num){
		System.out.println("Table of " + num + " is");
		for(int i=1;i<=10;i++){
			System.out.println("\n");
			for(int j=1;j<=num;j++){
				System.out.printf("%d*%d=%d\t",j,i,i*j);
			}
		}
	}
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	Tables t = new Tables();
	System.out.println("Enter the last table");
	int num = s.nextInt();
	t.table(num);
}
}
