package com.example.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * System.out 与 System.err的区别
 * 控制台的情况下 
 * 	out 的输出时黑色的 
 * 	err 的输出是红色的
 * 重定向到文件后 空指针异常会被打印到err的重定向文件
 */
public class SystemDemo1 {
	public static void main(String[] args) throws IOException {
		System.err.println("这个System.err");
		System.out.println("这是System.out");

		System.setErr(new PrintStream(new FileOutputStream(new File("err.txt"))));
		System.setOut(new PrintStream(new FileOutputStream(new File("out.txt"))));
		
		System.err.println("这个System.err");
		System.out.println("这是System.out");
		
		Object obj = null;
		obj.toString();
	}
}
