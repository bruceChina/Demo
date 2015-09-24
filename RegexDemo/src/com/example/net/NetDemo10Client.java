package com.example.net;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 读取自身发送
 */
public class NetDemo10Client {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(
				new FileReader("mail.txt"));
		Socket socket = new Socket("127.0.0.1", 2346);
		PrintWriter pWriter = new PrintWriter(socket.getOutputStream(), true);
		String line = null;
		while((line = bReader.readLine()) != null){
			pWriter.println(line);
		}
		socket.shutdownOutput();
		socket.close();
		bReader.close();
		System.out.println("Finish send");
	}
	
}
