class Sum{
	int num = 123;
	int sum = 0;
	public void logic(){
		while(num!=0){
			int rem = num % 10;
			sum += rem;
			num /=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		Sum s = new Sum();
		s.logic();
	}
}
