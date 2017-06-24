class RegularPolygon
{
	private int n;
	private double side, x, y;
	RegularPolygon()
	{
	n = 3;
	side = 1;
	x = y = 0;
	}
	RegularPolygon(int n1, double s)
	{
	n = n1;
	side = s;
	x = y = 0;
	}
	RegularPolygon(int n1, double s, double x1, double y1)
	{
	this(n1,s);
	x = x1;
	y = y1;
	}
	public double getPerimeter()
	{
		return side * n;
	}
	public double getArea()
	{
		return (n * (side * side) / (4 * Math.tan((180 * 3.142857 / 180) / n))); 
	}
}
class cs35
{
	public static void main(String[] args)
	{
	int n = Integer.parseInt(args[0]);
	double side = Double.parseDouble(args[1]);	
	double x = Double.parseDouble(args[2]);
	double y = Double.parseDouble(args[3]);
	RegularPolygon na = new RegularPolygon();
	RegularPolygon pns = new RegularPolygon(n,side);
	RegularPolygon pnsxy = new RegularPolygon(n , side, x, y);
	System.out.println("<<No argument constructor>>\nPerimeter = " + na.getPerimeter() +"\nArea = " + na.getArea());
	System.out.println("<<N and side arguments constructor>>\nPerimeter = " + pns.getPerimeter() +"\nArea = " + pns.getArea());
	System.out.println("<<N, Side, X and Y arguments constructor>>\nPerimeter = " + pnsxy.getPerimeter() +"\nArea = " + pnsxy.getArea());
	
	}
}


/*
Ouput : - 
>java cs35 6 6 0 0
<<No argument constructor>>
Perimeter = 3.0
Area = 0.43259135558736217
<<N and side arguments constructor>>
Perimeter = 36.0
Area = 93.48524374406341
<<N, Side, X and Y arguments constructor>>
Perimeter = 36.0
Area = 93.48524374406341
*/