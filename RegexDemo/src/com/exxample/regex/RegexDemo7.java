package com.exxample.regex;
/*
 * 需求:  我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
 * 将字符串还原成:“我要学编程”。
 * 解法 :	 
 * 		1 把"."去除
 * 		2 叠词保留一个字       
 * 		
 */
public class RegexDemo7 {
	public static void main(String[] args) {
		String string = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		string = string.replaceAll("\\.", "");
		
		System.out.println(string);
		
		String regex = "(.)\\1+";
		//$1表示第一组的内容
		string = string.replaceAll(regex, "$1");
		System.out.println(string);
	}
}
