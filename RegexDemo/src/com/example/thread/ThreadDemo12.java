package com.example.thread;
/*
 * join()
 */
public class ThreadDemo12 {
	public static void main(String[] args) {
		JoinI joinI1 = new JoinI();
		JoinI joinI2 = new JoinI();
		JoinI joinI3 = new JoinI();
		JoinI joinI4 = new JoinI();
		JoinJ joinJ = new JoinJ();
		joinI1.setName("i1");
		joinI2.setName("i2");
		joinI3.setName("i3");
		joinI4.setName("i4");
		
	
		
		joinI1.start();
		joinJ.start();
		try {
			joinJ.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		joinI2.start();
		joinI3.start();
		joinI4.start();
		
		
		
	}
}

class JoinJ extends Thread{

	@Override
	public void run() {
		for (int j = 0; j < 10; j++) {
			System.out.println(getName() + "j + " + j);
		}
	}
}

class JoinI extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "i + " + i);
		}
	}
}