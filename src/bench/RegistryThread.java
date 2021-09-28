/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bench;

/**
 *
 * @author khacn
 */
import java.net.Socket;

import Peer.Peer;

public class RegistryThread extends Thread{
	private Peer peer;
	private Socket socket;
	
	public RegistryThread(Peer peer, Socket socket){
		this.peer = peer;
		this.socket = socket;
	}
	
	public void run(){
		try {
			peer.register(socket);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
