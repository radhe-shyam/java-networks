import java.rmi.*;
import java.io.*;
import java.rmi.server.*;
public class  ftocImpl extends UnicastRemoteObject implements ftoc
{
 public ftocImpl()throws RemoteException
{
super();
}
public float getftoc(float c)throws RemoteException
{
//float c = 21.5f;
float f = 9/5 * c + 32;
return  f;
}
}