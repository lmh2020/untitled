package Socaket;

import java.io.IOException;

import java.net.ServerSocket;

public class Socket {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try{
            serverSocket=new ServerSocket(8888);



        }catch (IOException e){
            System.out.println("Could not listen on port: 9999.");
            System.exit(1);
        }
        Socket client=null;

        try{
            client=serverSocket.accept();

        }catch (IOException e){
            System.out.println("The server port is :"+client.getL);
        }
    }


}
