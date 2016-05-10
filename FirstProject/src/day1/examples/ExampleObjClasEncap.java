package day1.examples;

public class ExampleObjClasEncap {

	public static void main(String[] args) {
		StudentEncaps Stu=new StudentEncaps();
		
		Stu.id=1;
		Stu.name="Mark";
		Stu.Marks=120;
		
		StudentEncaps John=new StudentEncaps();
		John.id=20;
		John.name="John";
		John.Marks=500;
		
		StudentEncaps tyrion=new StudentEncaps();
		tyrion.setId(33);
		tyrion.setName("Tyrion");
		tyrion.setMarks(600);
		
		StudentEncaps tywin=new StudentEncaps();
		tywin.setId(5);
		tywin.setName("Tywin");
		tywin.setMarks(800);
		System.out.println("id= "+Stu.id+" name= "+Stu.name+" Marks="+Stu.Marks);
		System.out.println("id= "+John.id+" name= "+John.name+" Marks="+John.Marks);
		System.out.println("id= "+tyrion.getId()+" name= "+tyrion.getName()+" Marks="+tyrion.getMarks());
		System.out.println("id= "+tywin.getId()+" name= "+tywin.getName()+" Marks="+tywin.getMarks());
		}

}
