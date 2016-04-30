package day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		int x=10;
		int y=-10;
		
		if(x>=0&&y>=0)
		{
			System.out.println("both num are positive");
			
		}else if(x>=0 || y>=0)
		{
			System.out.println("one of the number is positive");
		} else{
			System.out.println("both num are negative");
		}

	}

}
