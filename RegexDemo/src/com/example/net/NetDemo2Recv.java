package com.example.net;
/*
 * ����udp���ݰ�, ���ն˿���DatagramSocket����
 * 		1 ��������socket
 * 		2 �������հ�
 * 		3 ���ղ���ʾ
 * 		4 �ر�
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
