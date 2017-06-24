class calculator
{
int n1,n2;
int add()
	{
	return(n1+n2);
	}
int sub()
	{
	return(n1-n2);
	}
int div()
	{
	return(n1/n2);
	}
int mul()
	{
	return(n1*n2);
	}
}
class rdj
{
public static void main(String arg[])
	{
	calculator calci=new calculator();
	calci.n1=Integer.parseInt(arg[0]);
	calci.n2=Integer.parseInt(arg[1]);
	System.out.println("Addition = "add(););
	}
}