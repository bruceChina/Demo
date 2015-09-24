package com.example.thread;
/*
 * 创建两个线程并且启动
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread mThread1 = new MyThread();
		MyThread mThread2 = new MyThread();
		
		mThread1.setName("one");
		mThread2.setName("two");
		
		mThread1.start();
		mThread2.start();
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName() + "--------" + i);
		}
	}
}