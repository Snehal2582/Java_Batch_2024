package Package_1;

public class Student {

	int rollNo;
	int age;
	public void display1() {
		System.out.println("Welcome to all of you");
		
	}
	public void display2() {
		System.out.println("Automation is very easy");
	
	}
	
	public static void main(String[]args) 
	{
		Student s1 = new Student();
		s1.rollNo = 200;
		System.out.println("Roll number of s1 is " +s1.rollNo);
		s1.age = 12;
		System.out.println("Age of s1 is "+s1.age);
		s1.display1();
		s1.display2();
		
	}
}
