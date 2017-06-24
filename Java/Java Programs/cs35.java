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
		return n * side;
	}
	public double getArea()
	{
		return (n * (side * side) / (4 * Math.tan((180*3.142857/180)/n)));
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
	RegularPolygon pnsxy = new RegularPolygon(n,side,x,y);
	System.out.println("<<No argument constructor object.>>\nPerimeter : " + na.getPerimeter() + "\nArea : " + na.getArea());
	System.out.println("\n<<Parameter n and side constructor object.>>\nPerimeter : " + pns.getPerimeter() + "\nArea : " + pns.getArea());
	System.out.println("\n<<Parameter n, side, x and y constructor object.>>\nPerimeter : " + pnsxy.getPerimeter() + "\nArea : " + pnsxy.getArea());
	}
}


/*
Output :
>java cs35 6 6 3 4
<<No argument constructor object.>>
Perimeter : 3.0
Area : 0.43259135558736217

<<Parameter n and side constructor object.>>
Perimeter : 36.0
Area : 93.48524374406341

<<Parameter n, side, x and y constructor object.>>
Perimeter : 36.0
Area : 93.48524374406341
*/