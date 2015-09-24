package com.example.thread;
/*
 * 同步方法的使用
 */
public class ThreadDemo6 {
	public static void main(String[] args) {
		MyRunableSynMethod myRunableSynMethod = new MyRunableSynMethod();
		Thread thread1 = new Thread(myRunableSynMethod);
		Thread thread2 = new Thread(myRunableSynMethod);
		Thread thread3 = new Thread(myRunableSynMethod);
		Thread thread4 = new Thread(myRunableSynMethod);
		Thread thread5 = new Thread(myRunableSynMethod);

		thread1.setName("one");
		thread2.setName("two");
		thread3.setName("three");
		thread4.setName("four");
		thread5.setName("five");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}

class MyRunableSynMethod implements Runnable{
	private static int count = 200;
	
	@Override
	public void run() {
		while(count > 0){
			dec();
		}
	}
	
	private static synchronized void  dec(){
		if (count > 0) {
			System.out.println(Thread.currentThread().getName() + 
					"当前: " +
					count--);
		}
		
	}
}
