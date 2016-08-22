/*Given a string, find out the lexicographically smallest and largest substring of length k
 First input will be the string, Second input will be the lenght k.
 [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input

welcometojava
3

Sample Output

ava
wel

Explanation

Here is the list of all substrings of length :

wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava
Among them ava is the smallest and wel is the largest.


 */
import java.util.Scanner;

public class StringCompare {
	
	 private static Scanner scan;

	public static void main(String[] args) {
	        scan = new Scanner(System.in);
	        String s=scan.nextLine();
	        int k=scan.nextInt();
	        String HS="";
	        String LS="zzz";
	        String[] Str=new String[s.length()-k+1];
	        
	        for(int i=0;i<s.length()-k+1;i++)
	            {
	            Str[i]=s.substring(i, i+k);
	        }
	        for(int j=0;j<s.length()-k+1;j++)
	        {
	        	if(Str[j].compareTo(HS)>=0) HS=Str[j];
	        		        
	        	if(LS.compareTo(Str[j])>=0)  LS=Str[j];
	        	
	        }
	        System.out.println(LS);
	        System.out.println(HS);
	        
	        
	    }
	 
}

