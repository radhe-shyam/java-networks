import java.io.*;
import java.net.*;
import java.util.*;
class Server
{
            public static void main(String args[])
            {
            try
            {
                        ServerSocket obj=new ServerSocket(139);
                       
                        while(true)
                        {
                                    Socket obj1=obj.accept();
                                   
                                    DataOutputStream dout=new DataOutputStream(obj1.getOutputStream());
                                    Date d=new Date();
                                    String S=d.toString();
                                    dout.writeBytes(S+'\n');
                       
                                    obj.close();
                        }
            }
            catch(Exception e)
            {
                        System.out.println(e);
            }
            }
}


