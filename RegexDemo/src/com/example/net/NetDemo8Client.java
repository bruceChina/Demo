package com.example.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 输入一段数据后发送,在接收一段数据
 */
public class NetDemo8Client {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(
				new InputStreamReader(System.in));
		Socket socket = new Socket("127.0.0.1", 2346);
		BufferedReader bSocketReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		PrintWriter pWriter = new PrintWriter(socket.getOutputStream(), true);
		
		String line = null;
		while((line = bReader.readLine()) != null){
			pWriter.println(line);
			
			System.out.println("Recv: " + bSocketReader.readLine());
		}
		
		pWriter.close();
		bReader.close();
	}
}
