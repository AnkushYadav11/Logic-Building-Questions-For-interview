class Palindrom{
int num = 1727;
int no = num;
int rev = 0;
public void logic(){
while (num!=0){
	int rem = num%10;
	rev = (rev*10) + rem;
	num =num / 10;
}

if(no == rev){
	System.out.println("Palindrome");
}
else{
	System.out.println("Not Palindrome");
}
}
public static void main(String[] args){
	Palindrom p = new Palindrom();
	p.logic();
}
}
