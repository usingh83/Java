/*
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
 
Sample Input

madam

Sample Output

Yes

 */
import java.io.*;
import java.util.*;

public class StringReverse {

    private static Scanner sc;

	public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        String A=sc.next();
        char c[]=A.toCharArray();
        String R="";
        for(int i=A.length()-1;i>=0;i--)
            {
            R=R+c[i];
            };
        if (A.equals(R))
            {
            System.out.print("Yes");
            }
        else 
            System.out.print("No");
    }
}
