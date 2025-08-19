class Table{
	public static void main(String[] args){
		int num = 5;
		int n = num;
		int table;
		System.out.println("Table of 5 is.");
		for(int i=0;i<=10;i++){
			table = num * i;
			System.out.println(n + "*" + i + "= "+table);
		}
	}
}
