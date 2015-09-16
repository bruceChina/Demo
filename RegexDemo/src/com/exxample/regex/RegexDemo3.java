package com.exxample.regex;

import java.util.Scanner;

/*
 * 校验:
 * 		开头至少一个字符是单词字符
 * 		单词字符之后跟着"@"
 *      "@"跟着2-8单词字符
 *      如果后面还有,则是"." +　2-3个单词字符
 */
public class RegexDemo3 {

	public static void main(String[] args) {
		String regex = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,8}(\\.[a-zA-Z_0-9]{2,3})+";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入:");
			String string = sc.nextLine();
			if ("over".equals(string)) {
				break;
			}
			System.out.println(string.matches(regex));
		}
		sc.close();
	}

}
