public class UC3{
	public static void main(String[] args)
	{

		int Is_Full_Time=2;
		int Is_Part_Time=1;
		int Emp_Rate_Per_Hour=20;
		int emphrs=0;
		int empwage=0;
		double empcheck=Math.floor(Math.random()*10)%3;

		  if ( empcheck==Is_Full_Time )
			emphrs=8;
		  else if ( empcheck==Is_Part_Time)
			emphrs=4;
		  else
			emphrs=0;

		  empwage=emphrs*Emp_Rate_Per_Hour;
		  System.out.println("Emp Wage :" + empwage);
	}
}
