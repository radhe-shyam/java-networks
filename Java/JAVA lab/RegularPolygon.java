package cs45;
public class RegularPolygon
{
		private int n;
		private double side, x, y;
		public RegularPolygon()
		{
		n = 3;
		side = 1;
		x = y = 0;
		}
		public RegularPolygon(int n1, double s)
		{
		n = n1;
		side = s;
		x = y = 0;
		}
		public RegularPolygon(int n1, double s, double x1, double y1)
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