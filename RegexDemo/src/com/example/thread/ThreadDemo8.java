package com.example.thread;

/*
 * 取值与打印
 */
public class ThreadDemo8 {
	public static void main(String[] args) {
//		Student student1 = new Student();
//		Student student2 = new Student();
//		 System.out.println(student.getName());
//		 System.out.println(student.getAge());
		Student student = new Student();
		RunGet runGet = new RunGet(student);
		RunSet runSet = new RunSet(student);
		
		Thread thread1 = new Thread(runSet);
		Thread thread2 = new Thread(runGet);
		
		thread1.start();
		thread2.start();
		
	}
}

class Student {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class RunSet implements Runnable {

	private Student student;
	private boolean flag = true;

	public RunSet(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		while (true) {
			if (flag) {
				student.setAge(20);
				student.setName("two");

			} else {
				student.setAge(10);
				student.setName("one");
			}
			flag = !flag;
		
		}

	}
}


class RunGet implements Runnable{

	private Student student;
	public RunGet(Student student){
		this.student = student;
	}
	
	@Override
	public void run() {
		while(true){
			System.out.println(student.getName() + 
					"-----------" + 
					student.getAge());
			
		}
	}
	
}
