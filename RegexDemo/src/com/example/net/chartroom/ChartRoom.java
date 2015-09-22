package com.example.net.chartroom;

/**
 * 启动发送接收线程
 * 
 * @author Administrator
 *
 */
public class ChartRoom {
	public static void main(String[] args) {
		SendThread st = new SendThread();
		RecvThread rt = new RecvThread();
		Thread threadSend = new Thread(st);
		Thread threadRecv = new Thread(rt);
		threadSend.start();
		threadRecv.start();
	}
}
