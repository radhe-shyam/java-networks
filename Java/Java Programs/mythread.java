class MyThrd extends Thread{
	MyThrd(String Name){	
	super(Name);
	}
	public void run(){
	for(byte i=0;i<10;i++){
		try{
			System.out.print("**RDJ**");

			sleep(100);
			System.out.print("\b\b\b\b\b\b\b\b     \b\b");
			sleep(100);
			}catch(Exception e){}
		}
	}
}
class myThread{
	public static void main(String arg[]){
	MyThrd t=new MyThrd("radj");
	t.start();
	System.out.println("Hello");
	}
}