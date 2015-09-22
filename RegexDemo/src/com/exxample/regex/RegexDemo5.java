package com.exxample.regex;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 * 需求: 
 * 		1  第一个为数字1
 * 		2  第二个是数字3 或者 5
 * 		3 接下来是9位数字  
 * 注意 "\\d" "\d"的区别 
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
