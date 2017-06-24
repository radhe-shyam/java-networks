/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.applet.Applet;
import java.awt.*;
import java.util.*;
import java.text.*;

/**
 *
 * @author Guru
 */
public class DigitalClock extends Applet implements Runnable {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Thread t = null;
    int h = 0, m = 0, s = 0;
    String timestring = "";
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        
        setBackground(Color.green);
    }
    
    public void start()
    {
        t = new Thread(this);
        t.start();
    }
    // TODO overwrite start(), stop() and destroy() methods
    
    public void run() 
    {
        try{
        while(true)
        {
            Calendar cal = Calendar.getInstance();
            h = cal.get(Calendar.HOUR_OF_DAY);
            if(h>12) h-=12;
            m = cal.get(Calendar.MINUTE);
            s = cal.get(Calendar.SECOND);
            
            SimpleDateFormat formatter;
                formatter = new SimpleDateFormat("hh:mm:ss");
                    Date d = cal.getTime();
                    timestring = formatter.format(d);
                    
                    repaint();
                    t.sleep(1000);
        }
        }catch(Exception e)
        {}
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawString(timestring, 50, 50);
    }
}
