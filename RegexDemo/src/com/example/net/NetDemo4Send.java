package com.example.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * º¸≈Ã ‰»Î∑¢ÀÕ∂À
 */
public class NetDemo4Send {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		DatagramSocket dSocket = new DatagramSocket();
		while(true){
			String string = scanner.nextLine();
			if ("886".equals(string)) {
				break;
			}
			DatagramPacket dPacket = new DatagramPacket(string.getBytes(),
					string.getBytes().length, 
					InetAddress.getByName("127.0.0.1"),
					2346);
			dSocket.send(dPacket);
		}
		dSocket.close();
		scanner.close();
	}
}
