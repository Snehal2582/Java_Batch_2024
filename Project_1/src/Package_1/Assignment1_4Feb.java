package Package_1;

public class Assignment1_4Feb {

	public Assignment1_4Feb()
	
	{
		this(4,5,6);
		System.out.println("Default Constructor");
	}
	
	public Assignment1_4Feb(int a) 
	
   {    this();
		System.out.println("one Parameterized Constructor");
		
	}

	public Assignment1_4Feb(int a, int b)
	
	{    this(1);
		System.out.println("Two Parameterized Constructor");
	}
	
	public Assignment1_4Feb(int a, int b, int c)
	
	{
		System.out.println("Three Parameterized Constructor");
	
	}
	
	public Assignment1_4Feb(int a, int b,int c, int d)
	
	{   this(2,3);
		System.out.println("Four Parameterized Constructor");
	}
	
	public static void main (String[]args) 
	{
		
		Assignment1_4Feb construc4 = new Assignment1_4Feb(7,8,9,10);
		
	}
}

