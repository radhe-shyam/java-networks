/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Naming;
/**
 *
 * @author Guru
 */
public class RMIClient {
    
    public static void main(String[] arg) throws Exception
    {
        //Object O = Naming.lookup("Variance");
        RMIVarienceInterfaceImpl test = new RMIVarienceInterfaceImpl();
        test = (RMIVarienceInterfaceImpl)Naming.lookup("Variance");
        test.getVarience();
    }
}
