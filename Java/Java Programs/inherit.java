class person{
	String name,fname;
	person(String n, String f){
	name=n;
	fname=f;
	}
	void disp(){
	System.out.println("Name : Mr. "+name);
	System.out.println("Father's name : Mr. "+fname);	
	}
}
class students extends person{
	String cls;
	int rno;
	students(String n, String f,String c, int r){
	super(n ,f);
	cls=c;
	rno=r;
	}
	void disp(){
	super.disp();
	System.out.println("Class : "+cls);
	System.out.println("Roll no : "+rno);	
	}
}
class exam extends students{
	int per;
	exam(String n, String f,String c, int r, int p){
	super(n,f,c,r);
	per=p;
	}
	void disp(){
	super.disp();
	System.out.println("Percentage : "+per+"%");	
	}
}
class employee extends person{
	String qual;
	int sal;
	employee(String n, String f, String q, int s){
	super(n,f);
	qual=q;
	sal=s;
	}
	void disp(){
	super.disp();
	System.out.println("Qualification : "+qual);
	System.out.println("Salary : "+sal+"/-");	
	}
}
class teaching extends employee{
	String sub;
	teaching(String n, String f, String q, int s, String sj){
	super(n,f,q,s);
	sub=sj;
	}
	void disp(){
	super.disp();
	System.out.println("Subject : "+sub);
	}
}
class nonteaching extends employee{
	String designation;
	nonteaching(String n, String f, String q, int s, String d){
	super(n,f,q,s);
	designation=d;
	}
	void disp(){
	super.disp();
	System.out.println("Designation : "+designation);	
	}
}
class inherit{
public static void main(String arg[]){
	exam e=new exam("Radhe","Gopal Ram","BCA-IV",789,78);
	teaching t=new teaching("Ayush", "Ram kishor", "B.com", 10000, "Accountancy");
	nonteaching nt=new nonteaching("Piyush", "Swaroop kishor", "M.com", 20000, "CA");
	System.out.println("\t+++Student details+++");
	e.disp();
	System.out.println("\t+++Teaching employee details+++");
	t.disp();
	System.out.println("\t+++Nonteaching employee details+++");
	nt.disp();
	}
}