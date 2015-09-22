package com.example.net.chartroom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class RecvThread implements Runnable{

	@Override
	public void run() {
		int port = 2346;
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
			byte[] bytes = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
			try {
				ds.receive(dp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Receive from ip: " + 
			dp.getAddress().getHostAddress() + 
			" data: " + 
			new String(dp.getData())
			);
		}
	
	}

}
