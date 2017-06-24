import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class calculator extends Applet implements ActionListener
{
Button num[]=new Button[10];
Button op[]=new Button[4];
Button eq=new Button("=");
TextField tf=new TextField(20);
String s[]={"+","-","*","/"};
int num1=0,num2,res,j=0;
Panel p=new Panel();
public void init()
{
setLayout(new BorderLayout());
add(tf,BorderLayout.NORTH);
p.setLayout(new GridLayout(0,3));
for(int i=0;i<10;i++)
{
num[i]=new Button(String.valueOf(i));
num[i].addActionListener(this);
num[i].setActionCommand(String.valueOf(j++));
p.add(num[i]);
}
for(int i=0;i<4;i++)
{
op[i]=new Button(s[i]);
op[i].addActionListener(this);
op[i].setActionCommand(String.valueOf(j++));
p.add(op[i]);
}
p.add(eq);
add(p,BorderLayout.CENTER);
eq.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String a=ae.getActionCommand();
if(a.equals("="))
{
num2=Integer.parseInt(tf.getText());
if(j==10)
{
res=num1+num2;
tf.setText("");
}
else if(j==11)
res=num1-num2;
else if(j==12)
res=num1*num2;
else if(j==13)
res=num1/num2;
tf.setText(String.valueOf(res));
}
else
{
int x=Integer.parseInt(a);
if(x<10)
tf.setText(tf.getText()+a);
else
{
num1=Integer.parseInt(tf.getText());
tf.setText("");
j=x;
}
}
}
}