/**this is documentation comment*/
public class ex
{
	public static void main(String arg[])
		{int a,b,c;
		try{
		a=Integer.parseInt(arg[0]);
		b=Integer.parseInt(arg[1]);
		
		c=a/b;
		}
		catch(ArithmeticException e){
			c=0;
			System.out.println("Divide by zero exception");
			}
		System.out.print("c = "+c);
	}
}