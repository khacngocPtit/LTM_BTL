/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peer;

/**
 *
 * @author khacn
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import utils.Utils;

public class Server extends Thread{
	
	private String directory;
	private Socket socket;
	
	public Server(Socket socket, String directory){
		this.directory = directory;
		this.socket = socket;
	}
	
	public void run(){
		try{
	        DataInputStream dIn = new DataInputStream(socket.getInputStream());
	        String fileName = dIn.readUTF();
	        InputStream in = new FileInputStream(directory + "/" + fileName);
	        OutputStream out = socket.getOutputStream();
	        Utils.copy(in, out);
	        dIn.close();
	        out.close();
	        in.close();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
		
	}
}
