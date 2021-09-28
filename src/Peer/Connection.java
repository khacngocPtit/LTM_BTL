/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peer;

import java.net.Socket;

public class Connection {
	
    private Socket socket;
    private String directory;

    public Connection(Socket socket, String directory){
            this.socket = socket;
            this.directory = directory;
    }

    public Socket getSocket(){
            return socket;
    }

    public String getDirectory(){
            return directory;
    }

}
