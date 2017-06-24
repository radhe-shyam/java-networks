import java.io.*;
import java.net.*;
import java.util.*;
class Serverfile
{              public static void main(String args[]) throws Exception
                {     
					ServerSocket obj=new ServerSocket(139);
                    while(true)
                                {
								Socket obj1=obj.accept();
                                DataInputStream din=new DataInputStream(obj1.getInputStream());
                                DataOutputStream dout=new DataOutputStream(obj1.getOutputStream());
                                String str=din.readLine();
                                FileReader f=new FileReader(str);
                                BufferedReader b=new BufferedReader(f);
                                String s;
                                while((s=b.readLine())!=null)
                                    {
									//System.out.println(s);
                                    dout.writeBytes(s+'\n');       
									}
                                    f.close();
                                    dout.writeBytes("-1\n");     
								}
				}
}
class Clientfile
{              public static void main(String args[]) throws Exception
                {
                                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                                Socket clsct=new Socket("127.0.0.1",139);
                                DataInputStream din=new DataInputStream(clsct.getInputStream());
                                DataOutputStream dout=new DataOutputStream(clsct.getOutputStream());
                                System.out.println("Enter the file name:");
                                String str=in.readLine();
                                dout.writeBytes(str+'\n');
                                System.out.println("Enter the new file name:");
                                String str2=in.readLine();
                                String str1,ss;
                                FileWriter f=new FileWriter(str2);
                                char buffer[];       
                                                while(true)
                                                {               str1=din.readLine();
                                                                if(str1.equals("-1")) break;
                                                                //System.out.println(str1);
                                                                buffer=new char[str1.length()];
                                                                str1.getChars(0,str1.length(),buffer,0);
                                                                f.write(buffer);                                    
												}                                             
                                f.close();
                                clsct.close();                 
				}
}



