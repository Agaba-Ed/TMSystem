
package com.edcompanies;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Ed
 */
public class ClientHandler implements Runnable {
    
    public static void go() throws IOException{
         ServerSocket ss = new ServerSocket(7777);
         System.out.println("ServerSocket awaiting connections...");
         Socket socket = ss.accept(); 
         System.out.println("Connection from " + socket + "!");
         
         
        // create a DataInputStream so we can read data from it.
        objectInputStream = new ObjectInputStream(socket.getInputStream());
            

        
    }
    private static ObjectInputStream objectInputStream;

    public static ObjectInputStream getObjectInputStream() {
        return objectInputStream;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
