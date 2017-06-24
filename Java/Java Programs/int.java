interface i1{
	public String n="radhe";
	public void display();
}
class c1 implements i1{
	c1(String r){
	n=r;
	}
	public void display(){
		System.out.println("this is class c1 "+n);
	}
	void read(){		
	System.out.println(n);
	}
}
class inte{
	public static void main(String arg[]){
	c1 obj=new c1("Jangid");
	obj.display();
	obj.read();
	}
}