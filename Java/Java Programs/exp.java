

class exp

	{	
	public static void main(String [] args)
		{
			System.out.println("inside the main");
//try
//{


			maths.div(10,0);
//}
//catch( ArithmeticException e )
//{
//System.out.println("I am in main and have exception");
//}
			System.out.println("math completed");
		}
	}


class maths 
{

	static void div(int a, int b)
	{
		//try {
		
		integer.div(a,b);  
//    }
//		catch ( ArithmeticException e )
//		{     System.out.println(" Iam maths and handlin expception"); }

	}
}



class integer
{


	static void div(int a,int b)
	{

		if ( b==0 )
			{
		ArithmeticException e=new ArithmeticException("\n\n\t*************ary exception aay hai***************\n");
		//int c=a/b;
		System.out.println(" iam generating except");
		throw e;
			}
		else
		System.out.println(" divide completed");

	}

}
	
	