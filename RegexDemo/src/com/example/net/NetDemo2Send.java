package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * ʹ��UDP���з���, UDP���͵��Ķ�ȥ���ɰ������� ��������DatagramSocket����
 * 		1 ����udp����socket
 * 		2 ����udp���Ͱ�
 * 		3���
 * 		4 ���Ͳ��ر�
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
