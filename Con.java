class Con{
	public static void main(String[] args){
	int num = 5050;
	int rev = 0;
	int og = 0;
	while(num!=0){
		int rem = num %10;
		if(num % 10 == 0){
			rem = 1;
		}
		rev = (rev * 10) + rem;
		num /=10;
	}
	System.out.println(rev);
	while(rev!=0){
		int r = rev%10;
		og = (og * 10) + r;
		rev /=10;
	}
	System.out.println(og);
}
}
