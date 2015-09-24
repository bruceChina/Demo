package com.example.thread;
/*
 * 异步执行问题
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		TrickThread trickThread1 = new TrickThread();
		TrickThread trickThread2 = new TrickThread();
		TrickThread trickThread3 = new TrickThread();
		TrickThread trickThread4 = new TrickThread();
		TrickThread trickThread5 = new TrickThread();

		trickThread1.setName("one");
		trickThread2.setName("two");
		trickThread3.setName("three");
		trickThread4.setName("four");
		trickThread5.setName("five");

		trickThread1.start();
		trickThread2.start();
		trickThread3.start();
		trickThread4.start();
		trickThread5.start();
	}
}

class TrickThread extends Thread {
	private static int count = 200;

	@Override
	public void run() {
		while (count > 0) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() + " 当前: " + count--);
		}
	}
}