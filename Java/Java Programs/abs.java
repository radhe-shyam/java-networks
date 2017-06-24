//demonstrate abstract class
interface abscc{
	void prin();
	}
class radhe implements abscc{
public void prin(){
	System.out.println("radhe");
}
}
class abs{
public static void main(String arg[]){
radhe obj=new radhe();
obj.prin();
}
}