package com.example.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 * 先发送一段数据,然后在接受一段数据
 */
public class NetDemo6Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket	socket = new Socket("127.0.0.1", 2346);
		OutputStream oStream = socket.getOutputStream();
		oStream.write("Hello".getBytes());
		
		InputStream iStream = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int len = iStream.read(bytes);
		System.out.println("Recv: " + new String(bytes, 0, len));
		
		socket.close();
	}
}
