class rdj extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
	{	
	System.out.println(i);
	Thread.sleep(00);
	}
}
}
class brj
{
p ublic static void main(String arg[])
{
rdj t1=new rdj();
rdj t2=new rdj();
rdj t3=new rdj();
t1.start();
t2.start();
t3.start();
}
}