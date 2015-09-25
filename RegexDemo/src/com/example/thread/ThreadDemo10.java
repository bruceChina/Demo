package com.example.thread;

/*
 * wait() ”Î notify()
 * 
 *
 * 
 * 
 * 
 */
public class ThreadDemo10 {
	public static void main(String[] args) {
		StudentFlag studentFlag = new StudentFlag();
		RunWNGet runWNGet = new RunWNGet(studentFlag);
		RunWNSet runWNSet = new RunWNSet(studentFlag);

		Thread thread1 = new Thread(runWNGet);
		Thread thread2 = new Thread(runWNSet);

		thread1.start();
		thread2.start();
	}
}

class StudentFlag {
	public int age;
	public String name;
	public boolean flag = true;
}

class RunWNSet implements Runnable {

	private StudentFlag studentFlag;
	private boolean flag = true;
	public RunWNSet(StudentFlag studentFlag) {
		this.studentFlag = studentFlag;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (studentFlag) {
				if (!studentFlag.flag) {
					try {
						studentFlag.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				if (flag) {
					studentFlag.name = "One";
					studentFlag.age = 10;
				} else {
					studentFlag.name = "Two";
					studentFlag.age = 20;
				}
				flag = !flag;
				studentFlag.flag = false;
				studentFlag.notify();
			}
		}

	}

}

class RunWNGet implements Runnable {
	private StudentFlag studentFlag;

	public RunWNGet(StudentFlag studentFlag) {
		this.studentFlag = studentFlag;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (studentFlag) {
				if (studentFlag.flag) {
					try {
						studentFlag.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println(studentFlag.name + "-------------------------" + studentFlag.age);
					
					studentFlag.flag = true;
					studentFlag.notify();
				}
			}
		}
	}

}
