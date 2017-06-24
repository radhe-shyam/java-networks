import java.rmi.*;
import java.rmi.server.*;
public class  AddImpl extends UnicastRemoteObject implements add
{
 public AddImpl()throws RemoteException
{
super();
}
public int getsum()throws RemoteException
{
System.out.println("Calculating the sum ......");
int a=10;
int b=15;
int sum;
sum=a+b;
return  sum;
}
}