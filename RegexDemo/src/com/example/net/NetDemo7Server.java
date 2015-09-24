package com.example.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 获得小写字符串,转换成大写再返回
 */
public class NetDemo7Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ssSocket = new ServerSocket(2346);
		Socket socket = ssSocket.accept();
		System.out.println("Get Connection from ip: " + socket.getInetAddress().getHostAddress());
		BufferedReader bReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		BufferedWriter bWriter = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream()));
		String line = null;
		while((line = bReader.readLine()) != null){
			System.out.println("Recv data: " + line);
			bWriter.write(line.toUpperCase());
			bWriter.newLine();
			bWriter.flush();
		}
	}

}
