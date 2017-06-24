import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class MyGUI extends Applet implements ActionListener
{
	Label title;
	Button button;
	public void init()
	{
		setLayout(null);

		title = new Label("Simple Interest");
		title.setBounds(80,10,300,20);
		title.setAlignment(title.CENTER);
		add(title);
		
		button = new Button("S.I.");
		button.setBounds(150,210,100,20);
		add(button);

		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == button)
                    title.setText(Integer.toString(145));
	}
}
/*
c:\>javac MyGUI.java
c:\>appletviewer the.html

-----------------the.html--------------------------------
|<body>							|
|<applet code=MyGUI.class height=500 widht=500>		|
|</applet>						|
|</body>						|
---------------------------------------------------------
*/