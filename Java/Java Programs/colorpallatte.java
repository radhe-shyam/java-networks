import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class colorpallatte extends Applet implements MouseListener,ActionListener,AdjustmentListener

{
Button b1=new Button("Line");
Button b2=new Button("Oval");
Button b3=new Button("Fill Oval");
Button b4=new Button("Rect");
Button b5=new Button("Fill Rect");
Button b6=new Button();
Label l1=new Label(" ",Label.CENTER);
Panel p1=new Panel();
Scrollbar s1=new Scrollbar(Scrollbar.VERTICAL,1,1,0,255);
Scrollbar s2=new Scrollbar(Scrollbar.VERTICAL,1,1,0,255);
Scrollbar s3=new Scrollbar(Scrollbar.VERTICAL,1,1,0,255);
Graphics g;
int startx=0,starty=0,endx,endy;
String cmd="";
Color c=new Color(0,0,0);
public void init()
{
setLayout(new BorderLayout());
p1.setLayout(new GridLayout(3,3));
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(s1);
p1.add(s2);
p1.add(s3);
add(p1,BorderLayout.WEST);
add(l1,BorderLayout.SOUTH);
addMouseListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
s1.addAdjustmentListener(this);
s2.addAdjustmentListener(this);
s3.addAdjustmentListener(this);
g=getGraphics();
}
public void actionPerformed(ActionEvent ae)
{
cmd =ae.getActionCommand();
l1.setText(cmd);
}
public void mousePressed(MouseEvent me)
{
startx=me.getX();
starty=me.getY();
}
public void mouseReleased(MouseEvent me)
{
endx=me.getX();
endy=me.getY();
g.setColor(c);
int w=endx-startx;
int h=endy-starty;
if(cmd.equals("Line"))
g.drawLine(startx,starty,endx,endy);
else if(cmd.equals("Rect"))
g.drawRect(startx,starty,w,h);
else if(cmd.equals("Fill Rect"))
g.fillRect(startx,starty,w,h);
else if(cmd.equals("Oval"))
g.drawOval(startx,starty,w,h);
if(cmd.equals("Fill Oval"))
g.fillOval(startx,starty,w,h);
startx=starty=endx=endy=0;
}
public void mouseClicked(MouseEvent me)
{
}
public void mouseEntered(MouseEvent me)
{
}
public void mouseExited(MouseEvent me)
{
}
public void adjustmentValueChanged(AdjustmentEvent ae)
{
int x=s1.getValue();
int y=s2.getValue();
int z=s3.getValue();
c=new Color(x,y,z);
b6.setBackground(c);
}
}