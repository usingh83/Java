package day1.examples;

public class ExampleMethod {

	public static void main(String[] args) {
		
msg("Jack","Singh");
System.out.println("Your salary is");
System.out.println(Salary(100000,100000));

	}
	
	public static void msg(String a,String b)
	{
		System.out.println("Hello "+a+" "+b);
	}
	
	public static int Salary(int a,int bonus)
	{
		int sum=a+bonus;
		return sum;
	}

}
