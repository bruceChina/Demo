package com.example.thread;

/*
 * synchronized 的使用
 */
public class ThreadDemo5 {
	public static void main(String[] args) {
		MyRunableSynchronized myRunableSynchronized = new MyRunableSynchronized();
		Thread thread1 = new Thread(myRunableSynchronized);
		Thread thread2 = new Thread(myRunableSynchronized);
		Thread thread3 = new Thread(myRunableSynchronized);
		Thread thread4 = new Thread(myRunableSynchronized);
		Thread thread5 = new Thread(myRunableSynchronized);

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

class MyRunableSynchronized implements Runnable {

	private static int count = 200;
	private Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (obj) {

				if (count > 0) {
					System.out.println(Thread.currentThread().getName() + "当前:　" + count--);
				} else {
					break;
				}
			}
		}
	}

}