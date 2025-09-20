class Binary{

	int num1 = 547;
	int num2 = num1;
	String binary = " ";
	String octal = " ";

//Decimal To Binary Covertion
	public void binary(){
	while(num1!=0){
		int rem = num1 % 2;
		binary += rem;
		num1 /=2;
	}
	System.out.println("Binary Number:- "+binary);
	}

//Decimal To Octal Covertion
	public void octal(){
	while(num2!=0){
		int r = num2 % 8;
		octal += r;
		num2 /=8;
	}
	System.out.println("Octal Number:- "+octal);
	}

	public static void main(String[] args){	
		Binary b = new Binary();
		b.binary();
		b.octal();
	}
}

