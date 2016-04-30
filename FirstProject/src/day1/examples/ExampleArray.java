package day1.examples;

public class ExampleArray {

	public static void main(String[] args) {
		
		int[] a={10,20,30,40,50};
		for(int temp:a)
		{
			System.out.println("a="+temp);
		}
		
		System.out.println("------------------------");
		
		int[] b=new int[5];
		b[2]=23;
		b[4]=45;
		for(int temp:b)
		{
			System.out.println("b="+temp);
		}
		
		String[] str={"one","two","three"};
	    for(String temp:str)
	    {
	    	System.out.println("Str="+temp);
	    }
	    
		String[] st=new String[5];
		st[2]="sixty";
		st[4]="sixty seven";
	
		for( String temp:st)
		{
			System.out.println("St="+temp);
		}
			

	}

}
