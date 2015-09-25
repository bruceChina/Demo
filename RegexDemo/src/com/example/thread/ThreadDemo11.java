package com.example.thread;

/*
 *  ÿª§œﬂ≥Ã
 */
public class ThreadDemo11 {
	public static void main(String[] args) throws InterruptedException {
		Daemon daemon = new Daemon();
		daemon.setDaemon(true);
		daemon.start();
		Thread.sleep(1000);
		System.out.println("finish");
		
	}
}

class Daemon extends Thread {

	@Override
	public void run() {
		int i = 0;
		while (true) {
			System.out.println("i = " + i++);
		}
	}

}
