package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class NetDemo3Recv {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(2347);
		byte[] bytes = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		ds.receive(dp);
		System.out.println(dp.getAddress().getHostAddress());
		System.out.println(new String(dp.getData(), 0, dp.getLength()));
		ds.close();
	}
}
