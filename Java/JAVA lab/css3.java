class css3
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		String bin="";
		while( n != 0)
		{
		bin = n%2 + bin;
		n /= 2;
		}
		System.out.println("The binary is " +bin);
	}
}


/*
>java css3 3
The binary is 11

*/