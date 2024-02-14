package Package_1;

//((((10/2)-2)+2)-2)/2)

public class Assignment2_3Feb 
{

	public float div(float d, float e)
	
	{
		float f = d/e;
		return f;
	}
	public float sub(float a,float b) 
    {
	 
	 float c = a-b;
	  return c;
}
	public float sum(float x,float y) 
	{
		float z = x + y;
		return z;
	}
	public static void main (String[]args) 
	{
		Assignment2_3Feb calc = new Assignment2_3Feb();
		float div1= calc.div(10, 2);
		float sub1 = calc.sub(div1, 2);
		float sum1 = calc.sum(sub1, 2);
		float sub2 = calc.sub(sum1, 2);
		float div2 = calc.div(sub2, 2);
		System.out.println("The result of the calculation is " +div2);
		
}
}