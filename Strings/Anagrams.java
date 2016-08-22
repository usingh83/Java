/*
 * Two strings A and B are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT is CAT,ACT,TAC,TCA,ATC,CTA .

Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most 50 English characters; the comparison should NOT be case sensitive.

This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Sample Input 1

anagramm
marganaa
Sample Output 1:

Not Anagrams
 */

import java.util.Scanner;

public class Anagrams {
	private static Scanner sc;

	static boolean isAnagram(String A, String B) {
		  A=A.toLowerCase();
		  B=B.toLowerCase();
	      char c[]=A.toCharArray();
	      char d[]=B.toCharArray();
	      boolean bool=true;
        int countA[]=new int[A.length()];
        int countB[]=new int[B.length()];
	      if(A.length()==B.length())
	           {       
	      for(int i=0;i<A.length();i++) 
	           { 
            countA[i]=0;
            countB[i]=0;
	          boolean exist=false;
	          for(int j=0;j<B.length();j++)
	              {
	              if(c[i]==d[j])
	                  {
	                  exist=true;                      
	                  }
	              else exist=exist|false;  
                if(c[i]==c[j])
                    {
                    countA[i]++;
                    }    
                if(d[i]==d[j])
                    {
                    countB[i]++;
                    }   
                } 
	          bool=bool&exist;
             }
	          	           
	       
        for(int k=0;k<A.length();k++)
	       {
        	for(int l=0;l<B.length();l++)
                {
                if(c[k]==d[l] && countA[k]==countB[l])
                    bool=bool&true;  
                else if (c[k]==d[l] && countA[k]!=countB[l])
                    bool=bool&false;
            }  
        }
        }
     else
	           return false;
     
	       return bool;
	           
	   }
	   
	    public static void main(String[] args) {
	        
	        sc = new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        
	        boolean ret=isAnagram(A,B);
	        if(ret)System.out.println("Anagrams");
	        else System.out.println("Not Anagrams");
	        
	    }
	    }
