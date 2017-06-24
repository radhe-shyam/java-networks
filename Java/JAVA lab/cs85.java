class bs implements Runnable
{
	int[] a = {10,9,8,7,6,5,4,3,2,1};
	public void run()
	{
	int n = a.length;
	for(byte i = 0; i < n; i++)
		for(byte j = 1; j < n; j++)
			{
			if(a[j-1] > a[j])
				{
				int t = a[j-1];
				a[j-1] = a[j];
				a[j] = t;
				}
			}
	io.opn("Thread 1 for Bubble sort is completed.");
	}
	void display()
	{
	io.opn("Sorted array using bubble sort");
		for(byte i = 0; i < a.length; i++)
			io.opn(""+a[i]);
	}
}
class ss implements Runnable
{
	int[] a = {10,9,8,7,6,5,4,3,2,1};
	public void run()
	{
	int n = a.length;
	for(int i = 0; i < n; i++)
	{
		int min = i;	
		for(int j = i+1; j < n; j++)
			if(a[j] < a[min])
				min = j;
			int t = a[i];
			a[i] = a[min];
			a[min] =t;
	}
	io.opn("Thread 2 for Selection sort completed.");
	}
	void display()
	{
	io.opn("Sorted array using Selection sort");
		for(byte i = 0; i < a.length; i++)
			io.opn(""+a[i]);
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
	obj1.display();
	obj2.display();
	}
}