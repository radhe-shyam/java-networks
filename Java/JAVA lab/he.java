class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
try{
System.out.println("From ThreadA: i= "+i);
sleep(1000);
	}catch(Exception e){}
}
System.out.println("Exit from A");
}
}


class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("From ThreadB: j= "+j);
sleep(1000);
	}catch(Exception e){}
}
System.out.println("Exit from B");
}
}

class C extends Thread
{
public void run()
{
for(int k=1;k<=5;k++)
{
System.out.println("From ThreadC: k= "+k);
}
System.out.println("Exit from C");
}
}


class ThreadTest
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c= new C();
a.start();
b.start();
c.start();
}
}