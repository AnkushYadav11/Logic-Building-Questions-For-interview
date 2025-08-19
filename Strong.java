class Strong{
	public static void main(String[] args){
	int num = 145;
	int no = num;
	int sum = 0;
		while(num!=0){
			int rem = num % 10;
			for(int i= rem-1;i>=1;i--){
				rem = rem*i;
			}
			sum = sum + rem;
			num /=10;
		}

		if(no==sum){
			System.out.println("Strong");
		}
		else{
			System.out.println("Not");
		}
}
}
