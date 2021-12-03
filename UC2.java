public class UC2{
	public static void main(String[] args){
		int Is_Full_Time=1;
		int Emp_Rate_Per_Hour=20;
		int emphrs=0;
		int empwage=0;
		double empcheck=Math.floor(Math.random()*10)%2;
		  if (empcheck==Is_Full_Time)
			emphrs=8;
		  else
			emphrs=0;
		  empwage=emphrs*Emp_Rate_Per_Hour;
		  System.out.println("Emp Wage :" + empwage);
	}
}
