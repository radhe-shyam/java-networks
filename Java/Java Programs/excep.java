class excep
{
	public static void main(String [] args)
{
	int n=-1;
	try {
	
	n=div(10,0);
	}
	catch(Exception e) {}
	finally
	{
	System.out.println(n);
	}  }
static int div(int x, int y) throws Exception
{
	if ( y==0 )
	throw new Exception();
	return x/y;
}
}