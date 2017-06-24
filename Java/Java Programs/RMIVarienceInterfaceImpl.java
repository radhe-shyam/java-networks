

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

import java.util.Scanner;           



public class RMIVarienceInterfaceImpl extends UnicastRemoteObject implements vinter
{
    
    
public RMIVarienceInterfaceImpl()throws RemoteException
   
 {
        super();
    }

    
   
 public void getVarience() throws RemoteException 
{

        int[] values = new int[5];
       
 int sum =0 , mean = 0;
        
double var = 0, sd = 0;
        
       
 System.out.println("Enter five values");
       
 Scanner s = new Scanner(System.in);
       
 for(int i= 0; i<5; i++)
        
{
           
 values[i] = s.nextInt();
     
       sum += values[i];
        
}
      
  mean = sum/5;
     
   sum = 0;
        
     
   for(int i= 0; i<5; i++)
  
      {
            
values[i] -= mean;  
    
        values[i] *= values[i];
 
           sum += values[i];
        
}
        
       
 sd = sum/5;
        
var = Math.sqrt(sd);
    
    System.out.println("Varience of given data is = "+ var);
      
   
 }
    
}
