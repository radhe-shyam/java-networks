import java.io.*;
interface student{
	public void getdata(String n, int rln);
	}
class test implements student{
	String name; int rno;
	int m1,m2,m3;
	test(String n, int rln, int mk1, int mk2, int mk3){
		getdata(n, rln);
		m1=mk1; m2=mk2; m3=mk3;
		}
	public void getdata(String n, int rln){
		name=n; rno=rln;
		}
	}
interface grade extends student{
	public String calg();
	}
class result extends test implements grade{
	public String calg(){ return " "; }
	result(String n, int rln, int mk1, int mk2, int mk3){
		super(n,rln,mk1,mk2,mk3);
		}	
	}
class inc{
		public static void main(String arg[])throws IOException{
		
		//rdj: {System.out.print("Type again"); }
		try{
		inc.get();
			}catch(Exception e){
				System.out.println("wrong data, insert correct data again");
				//break rdj;
				inc.get();
				}
		}
	static void get()throws IOException{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
		String name=br.readLine();
		int rno=Integer.parseInt(br.readLine());
		int m1=Integer.parseInt(br.readLine());
		int m2=Integer.parseInt(br.readLine());
		int m3=Integer.parseInt(br.readLine());
		result obj=new result(name, rno, m1, m2, m3);
	}
	}