import java.io.*;
import cs45.*;
//RegularPolygon;
class cs45
{
	public static void main(String[] args)
	{
		try
		{
		RegularPolygon obj;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the value for n : ");
		int n = Integer.parseInt(br.readLine());
		System.out.print("Enter the length of side : ");
		Double s = Double.parseDouble(br.readLine());
		System.out.print("Enter the value for X co-ordinate : ");
		Double x = Double.parseDouble(br.readLine());
		System.out.print("Enter the value for Y co-ordinate : ");
		Double y = Double.parseDouble(br.readLine());
		obj = new RegularPolygon(n,s,x,y);
		System.out.println("Perimeter : " + obj.getPerimeter());
		System.out.println("Area : " + obj.getArea());
		}
		catch(Exception e)
		{
		System.out.print("Invalid Input.");
		}
	}
	
}

/*
>java cs45
Enter the value for n : 6
Enter the length of side : 6
Enter the value for X co-ordinate : 6
Enter the value for Y co-ordinate : 6
Perimeter : 36.0
Area : 93.48524374406341
*/