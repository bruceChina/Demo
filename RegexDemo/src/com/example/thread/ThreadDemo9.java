package com.example.thread;

/*
 * “Ï≤Ω¥Ú”°
 */
public class ThreadDemo9 {
	public static void main(String[] args) {
		Student student = new Student();
		RunSyncGet runSyncGet = new RunSyncGet(student);
		RunSyncSet runSyncSet = new RunSyncSet(student);

		Thread thread1 = new Thread(runSyncSet);
		Thread thread2 = new Thread(runSyncGet);

		thread1.start();
		thread2.start();

	}
}

class RunSyncGet implements Runnable {

	private Student student;

	public RunSyncGet(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (student) {
				System.out.println(student.getName() + "--------------------------" + student.getAge());
			}
		}
	}

}

class RunSyncSet implements Runnable {
	private Student student;
	private boolean flag = true;

	public RunSyncSet(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (student) {
				if (flag) {
					student.setName("One");
					student.setAge(1);
				} else {
					student.setName("Two");
					student.setAge(2);
				}
				flag = !flag;
			}
		}
	}

}
