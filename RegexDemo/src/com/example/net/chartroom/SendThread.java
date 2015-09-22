package com.example.net.chartroom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class SendThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int port = 2346;
		Scanner scanner = new Scanner(System.in);
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String string = scanner.nextLine();
		while (true) {
			if ("886".equals(string)) {
				break;
			}

			DatagramPacket dp;
			try {
				dp = new DatagramPacket(string.getBytes(), string.getBytes().length, InetAddress.getByName("127.0.0.1"),
						port);
				ds.send(dp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			string = scanner.nextLine();
		}

		ds.close();
		scanner.close();

	}

}
