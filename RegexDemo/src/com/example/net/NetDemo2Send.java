package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 使用UDP进行发送, UDP发送到哪儿去是由包决定的 而不是由DatagramSocket决定
 * 		1 创建udp发送socket
 * 		2 创建udp发送包
 * 		3填包
 * 		4 发送并关闭
 */
public class NetDemo2Send {
	public static void main(String[] args) throws IOException {
		int port = 2347;
		InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
		DatagramSocket ds = new DatagramSocket();
		String string = "Hello UDP";
		byte[] bytes = string.getBytes();
		int length = bytes.length;
		DatagramPacket dp = new DatagramPacket(bytes, length, inetAddress, port);
		ds.send(dp);
		ds.close();
	}
}
