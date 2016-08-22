
/*
 * In computer science, a priority queue is an abstract data type which is like a regular queue, but where additionally each element has a "priority" associated with it. In a priority queue, an element with high priority is served before an element with low priority. - Wikipedia

In this problem we will test your knowledge on Java Priority Queue.

You have to deal with 2 types of events: ENTER (a student enters the queue) or SERVED.

A unique token is assigned to any student entering the queue. The queue serves the students based on the following criteria:

The student having the highest Cumulative Grade Point Average (CGPA) is served first.
Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
Any students having the same CGPA and name will be served in ascending token order.
Given a sequence of 2 events, print the names of students who are yet to be served(based on above criteria). If the queue is empty, print EMPTY.

Input Format

The first line contains an integer,n , denoting the total number of events. Each of the n subsequent lines will be of the following two forms:

ENTER name CGPA token - The student to be inserted into the priority queue.
SERVED - The highest priority student in the queue was served.

Constraints

2<=n<=1000
0<=CGPA<=4.00 where CGPA belongs to the set of rational numbers
1<=token<=100000 where each token i is a unique integer.
2<=name<=30

Output Format

Print the names (based on the criteria) of the students who are not served at all after executing all  events; if every student in the queue was served, then print EMPTY.

Sample Input

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Sample Output

Dan
Ashley
Shafaet
Maria


 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student implements Comparable{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
@Override
public int compareTo(Object x) {
	Student o=(Student)x;
	Integer tok1=this.token;
	Integer tok2=o.token;
	if (this.cgpa>o.cgpa)
	{
		return -1;
	}
	else if (this.cgpa<o.cgpa)
		return 1;
	else {
		if (this.fname.compareTo(o.fname)==0)
		{
			return tok1.compareTo(tok2);
		}
		else return this.fname.compareTo(o.fname);
	}
}
@Override
public boolean equals(Object o)
{
	Student s=(Student)o;
	if(this.cgpa==s.cgpa && this.fname.equals(s.fname) && this.token==s.token)
	{
		return true;
	}
	else return false;
}
	

@Override
public String toString()
{
	return fname;
	
}
}

public class StudentPriorityQueue {

     public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      PriorityQueue pq=new PriorityQueue<Student>();
      Student NotServ;
      while(totalEvents>0){
         String event = in.next();
         if (event.equals("ENTER"))
         {
        	 String name=in.next();
        	 double cgpa=in.nextDouble();
        	 int token=in.nextInt();
        	 Student s=new Student(token,name,cgpa);
        	 pq.add(s);        	 
         }
         else if (event.equals("SERVED"))
         {
        	 //System.out.println(pq.poll());
             pq.poll();
         } 
         totalEvents--;
      }
      
      if(pq.isEmpty()) {System.out.println("EMPTY");
      }
      else{
      Iterator itr=pq.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(pq.remove());    	  
      }
      }
      
    }
}