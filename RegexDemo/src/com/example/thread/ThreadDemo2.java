package com.example.thread;
/*
 * 实现Runable 接口启动线程
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args) {
		MyRunable myRunable = new MyRunable();
		Thread thread1 = new Thread(myRunable);
		Thread thread2 = new Thread(myRunable);
		
		thread1.setName("one");
		thread2.setName("two");
		
		thread1.start();
		thread2.start();
	}
}
class MyRunable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() +
					"--------------" + 
					i);
		}
	}
	
}
