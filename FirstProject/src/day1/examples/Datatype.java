package day1.examples;

import java.util.Scanner;

public class Datatype {
	public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                	{System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                	}
                else if(x>=-32768 && x<=32767)
                {
                	System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-power(2,31) && x<=(power(2,31)-1)){
                    System.out.println("* int");
                    System.out.println("* long");
                }
                else if(x>=-power(2,63) && x<=(power(2,63)-1))System.out.println("* long");
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

	private static long power(int i, int j) {
		long result=1;
		for(int z=0;z<j;z++)
		result=result*i;
		return result;
	}
}