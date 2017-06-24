/*
	Interface implementation part of RMI Program
*/
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;
public class rdj06 extends UnicastRemoteObject implements rdj05
{
	public rdj06() throws RemoteException
	{
	super();
	}
	public float getvari(float[] arr) throws RemoteException
	{
	float sum=0, sd=0;
	for(int i = 0; i < arr.length; i++ )
		sum += arr[i];
	sum /= arr.length;
	for(int i = 0; i < arr.length; i++)
		sd += Math.pow(arr[i]-sum,2);
	return (float)Math.sqrt(sd);
	}
}