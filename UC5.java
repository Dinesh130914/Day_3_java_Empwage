	public class UC5{

		public static final int Is_Full_Time=2;
		public static final int Is_Part_Time=1;
		public static final int Emp_Rate_Per_Hour=20;
		public static final int Num_Of_Working_days=20;
	public static void main(String[] args)
	{

		int emphrs=0;
		int empwage=0;
		int totalempwage=0;
		for(int i=1;i<=Num_Of_Working_days;i++)
		{
		  int empcheck= (int) Math.floor(Math.random()*10)%3;
		  switch (empcheck)
			{

		  	 case Is_Full_Time :
				emphrs=8;
				break;
		  	 case Is_Part_Time :
				emphrs=4;
				break;
		  	 default :
				emphrs=0;
			}
		  empwage=emphrs*Emp_Rate_Per_Hour;
		  totalempwage+=empwage;
		  System.out.println("Emp Wage :" + empwage);

		}
		  System.out.println("Total Emp Wage :" + totalempwage);

	}
}
