package com.exxample.regex;

import java.util.Scanner;

/**
 * 
 * @author bruceChina У��: 1:Ҫ�������5-15λ���� 2:0���ܿ�ͷ ˼·: ��ͷ��[1-9]
 *         Ȼ����14λ������[0-9]{4,14}
 *
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		//String regex = "[1-9][0-9]{4,14}";
		
		//��һ����ʹ��, �����\d Ҫ���ַ���\\d
		String regex = "[1-9]\\d{4,14}";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������:");
			String string = sc.nextLine();
			if("over".equals(string)){
				break;
			}
			System.out.println(string.matches(regex));
		}
		sc.close();
	}
}
