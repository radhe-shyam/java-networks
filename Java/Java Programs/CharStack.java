//Assignment #6
//CharStack class for newpackage
//Designed by Radhe shyam Jangid
//Date 17/10/2010
package newpackage;
public class CharStack
	{
	public char a[];
	public int top;
	public CharStack(int x)
		{
		a=new char[x];
		top=-1;
		}
	public void push(char x)
		{
		if(top==a.length-1)
			System.out.println("CharStack is overflow");
		else
			{
			top++;
			a[top]=x;
			System.out.println("Pushed in CharStack = "+x);
			}
		}
	public char pop()
		{
		if(top<0)
			{
			System.out.println("CharStack is underflow");
			return '0';
			}
		else
			{
			System.out.println("Poped from CharStack = "+a[top]);
			top--;
			return (a[top+1]);
			}
		}
	}