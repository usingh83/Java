package day1.examples;

import java.util.Scanner;

public class ExceptionHandler {
	static boolean flag;
	static Scanner scan=new Scanner(System.in);
	static int B=scan.nextInt();
	static Scanner scan1=new Scanner(System.in);
	static int H=scan1.nextInt();
	static	
	{
     try{
	   if(H>=0 && B>=0)
	     {
		  flag=true;
	     }
	   else 
	     {
		  flag=false;
		  throw new Exception("Breadth and height must be positive");
	     } 
	    }  
      catch(Exception e) 
        {
	      System.out.println(e);
	    }	
	  }

	public static void main(String[] args){		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of 

