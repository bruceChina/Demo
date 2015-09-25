package com.example.thread;
/*
 * À¿À¯
 */
public class ThreadDemo7 {
	public static void main(String[] args) {
		DieLock dLock1 = new DieLock(true);
		DieLock dLock2 = new DieLock(false);
		
		dLock1.start();
		dLock2.start();
	}
}

class DieLock extends Thread{
	private boolean flag;

	public DieLock(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		if(flag){
			synchronized(Lock.lock1){
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName() + "lock1");
				synchronized(Lock.lock2){
					System.out.println(getName() + "lock2");
				}
			}
		}else{
			synchronized(Lock.lock2){
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName() + "lock2");
				synchronized(Lock.lock1){
					System.out.println(getName() + "lock1");
				}
			}
		}
		System.out.println(getName() + "finish");
	}
	
	
	
}

 class Lock{
	 public static final Object lock1 = new Object();
	 public static final Object lock2 = new Object();
 }
