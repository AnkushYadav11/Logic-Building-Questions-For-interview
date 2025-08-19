class Arm{
	int num = 152;
	int sum = 0;
	int no = num;
	public void logic(){
		while(num!=0){
			int rem = num %10;
			sum = (rem * rem * rem) + sum;
			num /=10;
		}
		if(no == sum){
			System.out.println("ArmStrong");
		}
		else{
			System.out.println("Not");
		}
	}
	public static void main(String[] args){
		Arm a = new Arm();
		a.logic();
	}
}
