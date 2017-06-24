




abstract class temp
{
	void printHello()
{
	System.out.println("hello");
}
	abstract void not();
}

interface other
{
	final public int x=25;
	public void radhe();
}

class abst extends temp implements other
{
	void not()
{
System.out.println("not");
}
public void radhe()
{
	System.out.println("Radhe is sleeping");          
}
       abst() {}

}
