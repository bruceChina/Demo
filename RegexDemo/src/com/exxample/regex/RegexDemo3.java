package com.exxample.regex;

import java.util.Scanner;

/*
 * У��:
 * 		��ͷ����һ���ַ��ǵ����ַ�
 * 		�����ַ�֮�����"@"
 *      "@"����2-8�����ַ�
 *      ������滹��,����"." +��2-3�������ַ�
 */
public class RegexDemo3 {

	public static void main(String[] args) {
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,8}(\\.[a-zA-Z_0-9]{2,3})+";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������:");
			String string = sc.nextLine();
			if ("over".equals(string)) {
				break;
			}
			System.out.println(string.matches(regex));
		}
		sc.close();
	}

}
