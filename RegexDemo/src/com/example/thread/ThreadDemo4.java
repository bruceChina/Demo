package com.example.thread;
/*
 * 使用接口重现异步执行问题
 */
public class ThreadDemo4 {
	public static void main(String[] args) {
		MyRunableSync myRunableSync = new MyRunableSync();
		Thread thread1 = new Thread(myRunableSync);
		Thread thread2 = new Thread(myRunableSync);
		Thread thread3 = new Thread(myRunableSync);
		
		thread1.setName("one");
		thread2.setName("two");
		thread3.setName("three");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class MyRunableSync implements Runnable{

	private static int count = 200;
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (count > 0) {
				System.out.println(Thread.currentThread().getName() + 
						"当前" +
						count--);
			}else {
				break;
			}
		}
	}
	
}