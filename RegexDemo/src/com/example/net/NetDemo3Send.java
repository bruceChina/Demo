package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * Demo2¸Ä½ø
 */
public class NetDemo3Send {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		byte[] bytes = "Hello UDP".getBytes();
		int length = bytes.length;
		DatagramPacket dp = new DatagramPacket(bytes, 
				length, 
				InetAddress.getByName("127.0.0.1"), 
				2347);
		ds.send(dp);
		ds.close();
				
	}
}
