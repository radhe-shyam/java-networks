import java.awt.*;
import java.applet.*;
public class app extends Applet 
{
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.drawLine(11,11,11,100);
		g.drawOval(1,1,50,50);
	}
}