package com.exxample.regex;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * ����: 
 * 		1  ��һ��Ϊ����1
 * 		2  �ڶ���������3 ���� 5
 * 		3 ��������9λ����  
 * ע�� "\\d" "\d"������ 
 */
public class RegexDemo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex = "1[35]\\d{9}";
		System.out.println("input:");
		String string = sc.nextLine();
		while(true){
			if("over".equals(string)){
				break;
			}
			System.out.println(string.matches(regex));
			System.out.println("input:");
			string = sc.nextLine();
		}
		
		sc.close();
	}
}
