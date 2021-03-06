package com.exxample.regex;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *
 * 校验
 * 		1: 11位的数字
 * 		2: 第一位是1 第二位是3 或者 5
 * 		3: 接下来的是任意数字
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		String regex = "1[35][0-9]{9}";
		Scanner sc = new Scanner(System.in);
		while(true){
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
