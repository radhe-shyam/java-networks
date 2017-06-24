/*
	Client part of RMI program
*/
import java.net.*;
import java.rmi.*;
import java.io.*;
public class rdj08
{
	public static void main(String[] args) throws Exception
	{
	Object o = Naming.lookup("Variance");
	rdj05 temp = (rdj05)o;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of elements : ");
	int n = Integer.parseInt(br.readLine());
	float[] arr = new float[n];
	for(int i = 0; i < arr.length; i++)
		arr[i] = Float.parseFloat(br.readLine());
	System.out.println("The variance is " + temp.getvari(arr));
	}
}