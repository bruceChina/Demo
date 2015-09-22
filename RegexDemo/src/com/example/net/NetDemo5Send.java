package com.example.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * tcp ·¢ËÍ¶Ë
 *
 */
public class NetDemo5Send {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 2346);
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("Hello TCP".getBytes());
		socket.close();
	}
}
