package com.example.net;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.sound.sampled.Line;

/*
 * ·¢ËÍÐ¡Ð´×Ö·û´®,»ñµÃ´óÐ´×Ö·û´®
 */
public class NetDemo7Client {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader( 
				new InputStreamReader(System.in));
		Socket socket = new Socket("127.0.0.1", 2346);
		BufferedWriter bWriter = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader bSocketReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		String line = null;
		while((line =  bReader.readLine()) != null){
			if ("over".equals(line)) {
				break;
			}
			
			bWriter.write(line);
			bWriter.newLine();
			bWriter.flush();
			System.out.println("Recv: " + bSocketReader.readLine());
			
		}
		
		socket.close();
		bReader.close();
		System.out.println("Over");
		
	}
}
