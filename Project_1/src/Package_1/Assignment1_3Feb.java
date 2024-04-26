package Package_1;

//((((10 + 2)+2)-2)*2)/2)

public class Assignment1_3Feb {
	
	public int sum(int x,int y) 
	{
		int z = x + y;
		return z;
	}

     public int sub(int a,int b) 
     {
	 
	 int c = a-b;
	  return c;
 }
	public int multiply(int e, int f) 
	{
		
		int g = e * f;
		 return g;
	}
	public int div(int d, int e)
	{
		int f = d/e;
		return f;
	}
	
	public static void main (String[]args) 
	{
		Assignment1_3Feb calc = new Assignment1_3Feb();
		int sum = calc.sum(10, 2);
		int sum2 = calc.sum(sum, 2);
		int sub1 = calc.sub(sum2, 2);
		int mult1 = calc.multiply(sub1,2);
		int div1= calc.div(mult1, 2);
		System.out.println("The result of the calculation is " +div1);
	}
	
}
