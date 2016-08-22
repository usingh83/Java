
/*
 * For this problem, we have 2 types of queries you can perform on a List:

Insert y at index x:

Insert
x y
Delete the element at index x:

Delete
x
Given a list,L , of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,N  (the initial number of elements in L). 
The second line contains N space-separated integers describing . 
The third line contains an integer, Q (the number of queries). 
The 2Q subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers ,x y and the value y must be inserted into L at index x.
If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

Constraints

1<=N<=4000
1<=Q<=4000
Each element in is a 32-bit integer.

Output Format

Print the updated list  as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output

0 1 78 12 23

Explanation

L=[12,0,1,78,12]
 Insert 23 at index 5.
L=[12,0,1,78,12,23]  

 Delete the element at index 0. 
L=[0,1,78,12,23]
Having performed all Q queries, we print L1 as a single line of space-separated integers.
 */

import java.util.*;

public class ListMaker {

    private static Scanner sc;

	public static void main(String[] args) {
     sc = new Scanner(System.in);
     int n=sc.nextInt();
     ArrayList<Integer> l=new ArrayList<Integer>(); 
     for(int i=0;i<n;i++)
     {
    	 l.add(sc.nextInt());
     }
     int t=sc.nextInt();
     String q=null;
     for(int i=0;i<t;i++)
     {    	 
    	 q=new String(sc.next());
    	 if (q.equals("Insert"))
    	 {
    		 int a=sc.nextInt();
    		 int b=sc.nextInt();
    		 l.add(a, b);;
    	 }
    	 else if (q.equals("Delete"))
    	 {
    		 int a=sc.nextInt();
    		 l.remove(a);
    	 }
    	 }
     Iterator<Integer> i=l.iterator();
     while(i.hasNext())
     {
    	 Integer r=(Integer)i.next();
         System.out.print(r+" ");
     }
    }
}
