class Natural{
	int N = 9;
	int sum = 0;
	public void logic(){
		for(int i=1;i<N;i++){
			sum +=i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		Natural n = new Natural();
		n.logic();
	}
}
