/*
 * You are given a class Solution and its main method in the editor. In each test cases, it takes an input ch which represents a choice of the following:

ch=1 represents the volume of a cube that has to be calculated where a represents the length of the sides of the cube.
ch=2 represents the volume of a cuboid that has to be calculated where l,b,h represent the dimensions of a cuboid.
ch=3 represents the volume of a hemisphere that has to be calculated where r represents the radius of a hemisphere.
ch=4 represents the volume of a cylinder that has to be calculated where r,h represent the radius and height of the cylinder respectively.
Your task is to create the class Calculate and the required methods so that the code prints the volume of the figures rounded to exactly 3 decimal places.

In case any of the dimensions of the figures are <=0, print "java.lang.NumberFormatException: All the values must be positive" without quotes and terminate the program.

Note: Use Math.PI as the value of pi.

Input Format

First line contains T, the number of test cases. Each test case contains ch, representing the choice as given in the problem statement.

When ch=1, Next line contains a, length of the sides of the cube.
When ch=2, Next three lines contain l, b, h representing length, breadth and height of the cuboid respectively. , ,  will be in three separate lines
When ch=3, Next line contains r, the radius of the hemisphere
When ch=4, Next two lines contain r,h  representing the radius and height of the cylinder respectively.r ,h  will be in two separate lines.
Note: You have to determine the data type of each parameter by looking at the code given in the main method.

Constraints 

1<=ch<=4
-100<a,l,b,h,r<=100
There will be at most 3 digits after decimal point in input.

Output Format

For each test case, print the answer rounded up to exactly 3 decimal places in a single line. For example, 1.2345 should be rounded to 1.235, 3.12995 should be rounded to 3.130.

Sample Input 1

2
1
4
4
67.89
-98.54

Sample Output 1

64.000
java.lang.NumberFormatException: All the values must be positive

Explanation 

There are two test cases. In the first test case ch=1, means you have to calculate the volume of a cube. The next line contains the a=4, means the side of the cube is 4. So the volume of the cube is 64. 
In the second test case, you have to calculate volume of a cylinder. But the height of the cylinder is negative, so an exception is thrown.

Sample Input 2

1
3
1.02

Sample Output 2

2.223
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;
public class CalculatingVolume {

	 public static void main(String[] args) {
	   DoNotTerminate.forbidExit();
	   try {
	    Calculate cal = new Calculate();
	    int T = cal.get_int_val();
	    while (T--> 0) {
	     double volume = 0.0;
	     int ch = cal.get_int_val();
	     if (ch == 1) {
	      int a = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(a);
	     } else if (ch == 2) {
	      int l = cal.get_int_val();
	      int b = cal.get_int_val();
	      int h = cal.get_int_val();
	      volume = Calculate.do_calc().get_volume(l, b, h);

	     } else if (ch == 3) {
	      double r = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r);

	     } else if (ch == 4) {
	      double r = cal.get_double_val();
	      double h = cal.get_double_val();
	      volume = Calculate.do_calc().get_volume(r, h);

	     }
	     cal.output.display(volume);
	    }

	   } catch (NumberFormatException e) {
	    System.out.print(e);
	   } catch (IOException e) {
	    e.printStackTrace();
	   } catch (DoNotTerminate.ExitTrappedException e) {
	    System.out.println("Unsuccessful Termination!!");
	   }


	  } //end of main
	} //end of Solution
class Calculate{	
	Scanner s=new Scanner(System.in);
	public int get_int_val() throws IOException {
		int i=s.nextInt();
		if (i<=0) {throw new NumberFormatException("All the values must be positive");}
		else return i;
	}

	public double get_double_val() throws IOException {
		double d=s.nextDouble();
		if (d<=0) {throw new NumberFormatException("All the values must be positive");}
		return d;
	}
	
	static Calculate output=new Calculate();
	public static Calculate do_calc() {
		return output;		
	}
	
	public double get_volume(int a) 
	{   
		return a*a*a;
	}
	public double get_volume(int l,int b,int h) 
	{
		return l*b*h;
	}
	public double get_volume(double r) 
	{   
		return (4*Math.PI*r*r*r)/6;
	}
	public double get_volume(double r,double h) 
	{   
		return Math.PI*r*r*h;
	}
	public void display(double volume)
	{
		System.out.printf("%.3f",volume);
        System.out.println();
	}
}
	/**
	 *This class prevents the user form using System.exit(0)
	 * from terminating the program abnormally.
	 *
	 */
	class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {}

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	} //end of Do_Not_Terminate
