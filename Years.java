class Years{
	public static void main(String[] args){

	int days = 1000;
	System.out.println(days);

	int years = days/365;
	System.out.println(years + "years in " + days);

	int month = days % 365;
	int months = month/30;
	System.out.println(months +"months in " + month);

	int week = months % 30;
	int weeks = week/7;
	System.out.println(weeks +"weeks in " + week);

	}
}
