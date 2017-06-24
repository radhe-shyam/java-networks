class b
{
	public int add(int a, int b)
	{
	System.out.println("Addition of Integer : " +(a+b));
	return a+b;
	}
	public float add(float a, float b)
	{
	System.out.println("Addition of float : " +(a+b));
	return a+b;
	}
}
class a extends b
{
/*	private int add(int a, int b)
	{
		return a+b;
	}
	private float add(float a, float b)
	{
		return a+b;
	}
*/	
}
class c
{
public static void main(String[] args)
	{
	a obj = new a();
	System.out.println("Addition of float : " +a.add(4.5f,4.5f));
	System.out.println("Addition of Integers : "+a.add(4,5));
	}
}