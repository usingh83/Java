package day1.examples;

public class ExampleTwoDArray {

	public static void main(String[] args) {
		
		int[][] a=new int[4][3];
		int temp=10;
		for(int i=0;i<=3;i++)
		{
		  for(int j=0;j<=2;j++)
		    {
			a[i][j]=temp;
			temp=temp+10;
			}
		}
		
		for(int i=0;i<=3;i++)
		{
		  for(int j=0;j<=2;j++)
		    {
			System.out.print(a[i][j]+" ");
			}
		  System.out.println();
		}


	}

}
