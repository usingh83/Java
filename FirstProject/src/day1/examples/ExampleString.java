package day1.examples;

public class ExampleString {

	public static void main(String[] args) {
		String st="Donald Trump";
        
				System.out.println("Hello "+st);
				System.out.println(st.toUpperCase());
				System.out.println(st.substring(3, 7));
				System.out.println(st.substring(3));
				System.out.println(st.charAt(3));
				
				String a="32";
				String b="56.25";
				int c=Integer.parseInt(a);
				double d=Double.parseDouble(b);
				System.out.println(c/2);
				System.out.println(d*1.15);
				
	}

}
