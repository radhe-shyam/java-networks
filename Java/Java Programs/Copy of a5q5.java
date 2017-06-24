class person{
	String name,fname;
	person(String n, String f){
	name=n;
	fname=f;	
	}
	void disp(){
	System.out.println("Name : "+name);
	System.out.println("Father's Name : Mr. "+fname);
	}
}
class student extends person{
	int rno;
	String cls;
	student(String n, String f, int r, String c){
	super(n,f);
	rno=r;
	cls=c;
	}
	void disp(){
	super.disp();
	System.out.println("Roll no : "+rno);
	System.out.println("Class : "+cls);
	}
}
class exam extends student{
	int per;
	exam(String n, String f, int r, String c, int p){
	super(n,f,r,c);
	per=p;
	}
	void disp(){
	super.disp();
	System.out.println("Percentage : "+per);
	}
}
class employee extends person{
	String qual;
	int sal;
	employee(String n, String f, int s, String q){
	super(n,f);
	sal=s;
	qual=q;
	}
	void disp(){
	super.disp();
	System.out.println("Qualification : "+qual);
	System.out.println("Salary : Mr. "+sal+"/-");
	}
}
class teaching extends employee{
	String sub;
	teaching(String n, String f, int s, String q, String sj){
	super(n,f,s,q);
	sub=sj;
	}
	void disp(){
	super.disp();
	System.out.println("Subject : "+sub);
	}
}
class nonteaching extends employee{
	String desig;
	nonteaching(String n, String f, int s, String q, String d){
	super(n,f,s,q);
	desig=d;
	}
	void disp(){
	super.disp();
	System.out.println("Designation : "+desig);
	}
}
class a5q5{
public static void main(String arg[]){
	exam e=new exam("Radhe","Gopal ram",987,"BCA-IV",78);
	teaching t=new teaching("Ayush","Ram kishore",10000,"B.com","Accountancy");
	nonteaching nt=new nonteaching("Piyush","Swaroop kishore",15000,"M.com","Accountant");
	System.out.println("\t+++Student's Details+++");
	e.disp();
	System.out.println("\n\t+++Teaching employee's Details+++");
	t.disp();
	System.out.println("\n\t+++Non-Teaching employee's Details+++");
	nt.disp();
	}
}

//Output: -
//Z:\Java>java a5q5
//        +++Student's Details+++
//Name : Radhe
//Father's Name : Mr. Gopal ram
//Roll no : 987
//Class : BCA-IV
//Percentage : 78

//        +++Teaching employee's Details+++
//Name : Ayush
//Father's Name : Mr. Ram kishore
//Qualification : B.com
//Salary : Mr. 10000/-
//Subject : Accountancy

//        +++Non-Teaching employee's Details+++
//Name : Piyush
//Father's Name : Mr. Swaroop kishore
//Qualification : M.com
//Salary : Mr. 15000/-
//Designation : Accountant