package com.example.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 先接受一段数据 在发送一段数据
 */
public class NetDemo6Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(2346);
		Socket socket = serverSocket.accept();
		
		InputStream iStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int len = iStream.read(bytes) ;
		System.out.println("Recv: " + new String(bytes, 0, len));
		
		OutputStream oStream = socket.getOutputStream();
		oStream.write("Bye".getBytes());
		
		socket.close();
	}
}
