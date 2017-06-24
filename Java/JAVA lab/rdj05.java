/*
	interface part for RMI program
*/
import java.rmi.*;
public interface rdj05 extends Remote
{
public float getvari(float[] arr) throws RemoteException;
}