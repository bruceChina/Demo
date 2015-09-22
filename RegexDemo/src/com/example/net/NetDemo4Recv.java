package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * ���޽��ն�
 */
public class NetDemo4Recv {
	public static void main(String[] args) throws IOException {
		DatagramSocket dSocket = new DatagramSocket(2346);
		while(true){
			byte[] bytes = new byte[1024];
			DatagramPacket dPacket = new DatagramPacket(bytes, bytes.length);
			dSocket.receive(dPacket);
			//new String(bytes, 0, bytes.length) Ч��������ľ�����ͬ
			//new String(dPacket.getData(), 0, dPacket.getData().length)
			System.out.println("Receive from ip: " + 
					 dPacket.getAddress()+ 
					" data: " +
					new String(dPacket.getData(), 0, dPacket.getData().length));
		}
	}
}
