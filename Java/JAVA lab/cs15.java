class cs15
{
	public static void main(String[] args)
	{
	float sum = 0;
	for(float i = 1; i < 98; i += 2)
		sum += i/(i + 2);
	System.out.print("The sum of series is " + sum);
	}
}

/*
Output : -
>java cs15
The sum of series is 45.124443
*/