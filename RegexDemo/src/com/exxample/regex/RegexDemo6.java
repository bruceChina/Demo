package com.exxample.regex;
/*
 * 叠词切割
 * 需求: "assdfffgghveggs"
 * 		切割后剩下a d h v e s
 */
public class RegexDemo6 {
	public static void main(String[] args) {
		String string = "assdfffgghveggs";
		//这个是3次及以上
		String regex = "(.)\\1{2,}";
		//String regex = "(.)\\1+";
		String[] splits = string.split(regex);
		System.out.println(splits.length);
		for (String split : splits) {
			System.out.println(split);
		}
	}
}
