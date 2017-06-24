//Assignment #6
//IntStack class for newpackage
//Designed by Radhe shyam Jangid
//Date 17/10/2010
package newpackage;
public class IntStack
	{
	public int a[];
	public int top;
	public IntStack(int x)
		{
		a=new int[x];
		top=-1;
		}
	public void push(int x)
		{
		if(top==a.length-1)
			System.out.println("IntStack is overflow");
		else
			{
			top++;
			a[top]=x;
			System.out.println("Pushed in IntStack = "+x);
			}
		}
	public int pop()
		{
		if(top<0)
			{
			System.out.println("IntStack is underflow");
			return 0;
			}
		else
			{
			System.out.println("Poped in IntStack = "+a[top]);
			top--;
			return(a[top+1]);
			}
		}
	}