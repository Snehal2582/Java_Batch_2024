package Package_1;

public class Assignment2_4Feb {

  public Assignment2_4Feb()
	
	{
		this(7,8,9,10);
		System.out.println("Default Constructor");
	}
	
	public Assignment2_4Feb(int a) 
	
   {    this();
		System.out.println("one Parameterized Constructor");
		
	}

	public Assignment2_4Feb(int a, int b)
	
	{    this(1);
		System.out.println("Two Parameterized Constructor");
	}
	
	public Assignment2_4Feb(int a, int b, int c)
	
	{
		System.out.println("Three Parameterized Constructor");
	
	}
	
	public Assignment2_4Feb(int a, int b,int c, int d)
	
	{   this(4,5,6);
		System.out.println("Four Parameterized Constructor");
	}
	
	public static void main (String[]args) 
	{
		
		Assignment2_4Feb construc2 = new Assignment2_4Feb(2,3);
		
	}
}



