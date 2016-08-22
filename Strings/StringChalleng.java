/*
 * Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.

Input Format

The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input

hello
java

Sample Output

9
No
Hello Java

Explanation

String A is "hello" and B is "java".

A has a length of 5, and B has a length of 4; the sum of their lengths is 9. 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,A  is not larger than B and the answer is No.

When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".

 */
import java.util.Scanner;

public class StringChalleng {
	
private static Scanner sc;

public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        char x[]=A.toCharArray();
        char y[]=B.toCharArray();   
        
        int i=0;
        
        while(i<B.length() || i<A.length())
            {
            if (i==B.length())
            {
            		System.out.println("Yes");
                    break;
            }
            else if (i==A.length())
            {
        		System.out.println("No");
                break;
            }
            else if (i==A.length()-1 && i==B.length()-1)
            {
        		System.out.println("No");
                break;
            }
            else if(x[i]>y[i])
                {
            	i++;
                System.out.println("Yes");
                break;
                }
            else if(x[i]<y[i])
                {
            	i++;
                System.out.println("No");
                break;
                }
            else if(i==A.length()-1 && i==B.length()-1) {
            	System.out.println("No");
                        }
            else i++;
           
            }
        
        String S="";
        for(int j=0;j<A.length();j++)
            {
        	
            
            if (j==0){
                S=S+x[j];
                S=S.toUpperCase();
                   }
            else 
                S=S+x[j];
            }
        String D="";
        for(int k=0;k<B.length();k++)
            {
            if (k==0){
                D=D+" "+y[k];
                D=D.toUpperCase();
                   }
            else 
                D=D+y[k];
            }
        System.out.println(S+D);
        
}
}
