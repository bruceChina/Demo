package com.example.net;
/*
 * 接收udp数据包, 接收端口有DatagramSocket决定
 * 		1 创建接收socket
 * 		2 创建接收包
 * 		3 接收并显示
 * 		4 关闭
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class NetDemo2Recv {
	public static void main(String[] args) throws IOException {
		int port = 2347;
		DatagramSocket ds = new DatagramSocket(port);
		byte[] bytes = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		ds.receive(dp);
		System.out.println(dp.getAddress().getHostAddress());
		System.out.println(new String(bytes));
		ds.close();
	}
}
