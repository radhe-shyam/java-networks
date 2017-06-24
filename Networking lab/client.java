import java.io.*;
import java.net.*;
import java.util.*;
class Client
{
            public static void main(String args[])
            {
            try
            {
                        Socket clsct=new Socket("127.0.0.1",139);

                        DataInputStream din=new DataInputStream(clsct.getInputStream());
                        DataOutputStream dout=new DataOutputStream(clsct.getOutputStream());
                        String str=din.readLine();
                        dout.writeBytes(str+'\n');
                        System.out.println(str);                      
                        clsct.close();
            }
            catch (Exception e)
            {
            System.out.println(e);
            }
            }
}

