package com.example.net;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 接收并且写成文件
 */
public class NetDemo10Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(2346);
		Socket socket = serverSocket.accept();
		BufferedReader bReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		PrintWriter pWriter = new PrintWriter(new FileWriter("mail-copy.txt", true));
		String line = null;
		while ((line = bReader.readLine()) != null) {
			pWriter.println(line);
			System.out.println(line);
		}
		pWriter.close();
		socket.close();
		System.err.println("Finish recv");
	}
}
