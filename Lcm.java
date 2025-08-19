class Lcm{
	int n1 = 12;
	int n2 = 18;
	int min;
	int a;
	int lcm;
	public void logic(){
		if(n1<n2){
			min = n1;
		}
		else{
			min = n2;
		}
		for(int i=2;i<min;i++){
			if(n1%i==0 && n2%i==0){
				a = i;
			}
		}
		System.out.println("GCD "+a);
		lcm = (n1*n2)/a;
		System.out.println("LCM "+lcm);
	}
	public static void main(String[] args){
		Lcm l = new Lcm();
		l.logic();
	}
}
