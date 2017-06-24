class bs implements Runnable
{
	int[] a = {10,9,8,7,6,5,4,3,2,1}; 
	public void run()
	{
	int n = a.length;
	for(byte i =0; i<n;i++)
		for(byte j =1;j<(n-1);j++)
		{
		if(a[j-1]>a[j])
			{
			int t = a[j-1];
			a[j-1]=a[j];
			a[j]=t;
			}
		}
	io.opn("Thread 1 for Bubble sort is completed.");
	}
}
class ss implements Runnable
{
	int[] a = {10,9,8,7,6,5,4,3,2,1}; 
	public void run()
	{
	int N = a.length;
	for (int i = 0; i < N; i++)
		{
		int min = i;
		for (int j = i+1; j < N; j++)
			if (a[j] < a[min])
				min = j;
			int t = a[i];
			a[i] = a[min];
			a[min] = t;
		}
	io.opn("Thread 2 for Selection sort is completed.");
	}
}
class cs85
{
public static void main(String[] args)
	{
	bs obj1 = new bs();
	ss obj2 = new ss();
	Thread t1 = new Thread(obj1);
	Thread t2 = new Thread(obj2);
	t1.start();
	t2.start();
	}
}
