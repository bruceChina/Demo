package com.example.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * System.out �� System.err������
 * ����̨������� 
 * 	out �����ʱ��ɫ�� 
 * 	err ������Ǻ�ɫ��
 * �ض����ļ��� ��ָ���쳣�ᱻ��ӡ��err���ض����ļ�
 */
public class SystemDemo1 {
	public static void main(String[] args) throws IOException {
		System.err.println("���System.err");
		System.out.println("����System.out");

		System.setErr(new PrintStream(new FileOutputStream(new File("err.txt"))));
		System.setOut(new PrintStream(new FileOutputStream(new File("out.txt"))));
		
		System.err.println("���System.err");
		System.out.println("����System.out");
		
		Object obj = null;
		obj.toString();
	}
}
