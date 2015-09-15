package com.exxample.regex;

import java.util.Scanner;

/**
 * 
 * @author bruceChina 校验: 1:要求必须是5-15位数字 2:0不能开头 思路: 开头是[1-9]
 *         然后是14位的数字[0-9]{4,14}
 *
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		//String regex = "[1-9][0-9]{4,14}";
		
		//进一步的使用, 正则的\d 要用字符串\\d
		String regex = "[1-9]\\d{4,14}";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入:");
			String string = sc.nextLine();
			if("over".equals(string)){
				break;
			}
			System.out.println(string.matches(regex));
		}
		sc.close();
	}
}
