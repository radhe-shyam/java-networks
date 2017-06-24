/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Naming;

/**
 *
 * @author Guru
 */
public class RMIVarienceServer {
    
    public static void main(String[] arg) throws Exception
    {
        try
        {
        RMIVarienceInterfaceImpl V = new RMIVarienceInterfaceImpl();
        Naming.rebind("Variance", V);
        System.out.println("SERVER is Ready");
    }
   
    catch(Exception em)
    {
        System.out.println(em.toString());
    }
    }
}
