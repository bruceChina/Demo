package com.example.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * shutdownOutputµÄÊ¹ÓÃ
 */
public class NetDemo9Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(2346);
		Socket socket = serverSocket.accept();
		BufferedReader bReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		PrintWriter pWriter = new PrintWriter(socket.getOutputStream(), true);
		String line = null;
		while((line = bReader.readLine()) != null){
			pWriter.println(line.toUpperCase());
		}
		serverSocket.close();
	}
}
