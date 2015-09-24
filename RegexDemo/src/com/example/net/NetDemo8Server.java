package com.example.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 获得一段数据,转成大写,发送回去
 */
public class NetDemo8Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(2346);
		Socket socket = serverSocket.accept();
		System.out.println("Recv connect from ip: " + socket.getInetAddress().getHostAddress());
		BufferedReader bReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		PrintWriter pWriter = new PrintWriter(socket.getOutputStream(), true);
		while (true) {
			pWriter.println(bReader.readLine().toUpperCase());
		}
		
	}
}
