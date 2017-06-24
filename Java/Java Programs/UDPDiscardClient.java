import java.net.*;
import java.io.*;

public class UDPDiscardClient {

  public final static int port = 9;

  public static void main(String[] args) {

    String hostname;

    if (args.length > 0) {
      hostname = args[0];
    }
    else {
      hostname = "localhost";
    }

    try {

      String theLine;
      DatagramPacket theOutput;

      InetAddress server = InetAddress.getByName(hostname);
      DataInputStream userInput = new DataInputStream(System.in);
      DatagramSocket theSocket = new DatagramSocket();
      while (true) {
        theLine = userInput.readLine();
        if (theLine.equals(".")) break;
        byte[] data = new byte[theLine.length()];
        theLine.getBytes(0, theLine.length(), data, 0);
        theOutput = new DatagramPacket(data, data.length, server, port);
        theSocket.send(theOutput);
      }  // end while
    }  // end try
    catch (UnknownHostException e) {
      System.err.println(e);
    }  
    catch (SocketException se) {
      System.err.println(se);
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }  // end main

}