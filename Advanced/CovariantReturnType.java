/*
 * Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass of your specified return type.

Method Overriding allows a subclass to override the behavior of an existing superclass method and specify a return type that is some subclass of the original return type.

Note: It is best practice to use the @Override annotation when overriding a superclass method.

Write the classes and methods detailed in the diagram below:

MethodOverriding.png

We will append a hidden Solution class to test your code; the main method in our test class takes the name of a state as input and prints the national flower of that state using the classes and methods you written by you.

Resources 
Covariant Return Type 
Java Covariant Type

Input Format

Input is handled for you by the hidden Solution test class.

Output Format

Output is handled for you by the hidden Solution test class.

Sample Input

A single line containing the name of a State:

AndhraPradesh
Sample Output

A single line containing the national flower of the State received as input:

Lily
 */
import java.util.Scanner;
import java.util.Set;
import java.lang.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Flower{
	public String whats_Your_Name(){
		return "I have many names and types";
	}	
}
class Jasmine extends Flower{
	@Override
	public String whats_Your_Name(){
		return "Jasmine";
	}	
}
class Lily extends Flower{
	@Override
	public String whats_Your_Name(){
		return "Lily";
	}	
}
class Lotus extends Flower{
	@Override
	public String whats_Your_Name(){
		return "Lotus";
	}	
}

class State{
	public Flower your_National_Flower(){
		return new Flower();
	}	
}
class WestBengal extends State{
	@Override
	public Jasmine your_National_Flower(){
		return new Jasmine();
	}	
}
class AndhraPradesh extends State{
	@Override
	public Lily your_National_Flower(){
		return new Lily();
	}	
}
class Karnataka extends State{
	@Override
	public Lotus your_National_Flower(){
		return new Lotus();
	}	
}

public class CovariantReturnType {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	Class c=Class.forName(str);
	Method m=c.getMethod("your_National_Flower");
	Object o=c.newInstance();
	Object ob=m.invoke(o, new Object[] {});
	if(ob instanceof Lotus)
	{
		Lotus l=(Lotus)ob;
		System.out.println(l.whats_Your_Name());
	}
	if(ob instanceof Lily)
	{
		Lily l=(Lily)ob;
		System.out.println(l.whats_Your_Name());
	}
	if(ob instanceof Jasmine)
	{
		Jasmine l=(Jasmine)ob;
		System.out.println(l.whats_Your_Name());
	}
	}
	
}
