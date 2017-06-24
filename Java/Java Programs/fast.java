import java.awt.Container;
import java.swing.*;
public class SquareInt extends JApplet{
	public void init(){
	String output="";
	JTextArea oArea=new JTextArea(10,20);
	Container c=getContentPane();
	c.add(oArea);
	int result;
	for(int x=1;x<=10;x++)
		{
		result=square(x);
		output+="Square of "+x+" is "+result +"\n";
		}
	outputArea.setText(output);
	}
	public int squre(int y)
		{
		return y*y;
		}
}