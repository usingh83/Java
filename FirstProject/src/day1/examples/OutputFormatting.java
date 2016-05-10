package day1.examples;

import java.util.Scanner;

/*
Input-
java 100
cpp 65
python 50
*/

public class OutputFormatting {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            String x=sc.next();
            System.out.print(s1);
            for(int t=s1.length();t<15;t++)
            System.out.print(" "); 
            while(x.length()<3)
                x="0"+x;
            System.out.print(x);
            System.out.println();
        }
        System.out.println("================================");

}

}
