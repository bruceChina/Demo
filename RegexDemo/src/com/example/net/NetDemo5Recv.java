package com.example.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * tcpΩ” ’∂À
 */
public class NetDemo5Recv {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(2346);
		Socket socket = serverSocket.accept();
		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int length = inputStream.read(bytes);
		System.out.println(new String(bytes, 0, length));
		socket.close();
		serverSocket.close();
	}
}
