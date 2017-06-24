import java.io.*;
import cs45.RegularPolygon;
class cs55
{
	public static void main(String[] args)
	{
		try
		{
		RegularPolygon obj;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the value for n : ");
		int n = Integer.parseInt(br.readLine());
		if(n < 1)
			throw new MyException();
		System.out.print("Enter the length of side : ");
		Double s = Double.parseDouble(br.readLine());
		if(s < 1)
			throw new MyException();
		System.out.print("Enter the value for X co-ordinate : ");
		Double x = Double.parseDouble(br.readLine());
		System.out.print("Enter the value for Y co-ordinate : ");
		Double y = Double.parseDouble(br.readLine());
		obj = new RegularPolygon(n,s,x,y);
		System.out.println("Perimeter : " + obj.getPerimeter());
		System.out.println("Area : " + obj.getArea());
		}
		catch(MyException e)
		{
		System.out.print(e);
		}
		catch(Exception e)
		{}
	}
	
}
class MyException extends Exception
{
	public String getMessage()
	{
 		return "Invalid Input";
	}
}

/*
>java cs55
Enter the value for n : -1
MyException: Invalid Input
*/