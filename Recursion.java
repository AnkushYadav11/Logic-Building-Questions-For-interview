class Recursion{
	public int sum(int n){
	if(n == 1){
	return 1;
	}
	return n + sum(n-1);
	}

	public static void main(String[] args){
		Recursion r = new Recursion();
		int n = 10;
		int result = r.sum(n);
		System.out.println("Sum Of Natural No.:- "+ result);	
	}
}
