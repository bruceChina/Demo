package com.exxample.regex;
/*
 * �����и�
 * ����: "assdfffgghveggs"
 * 		�и��ʣ��a d h v e s
 */
public class RegexDemo6 {
	public static void main(String[] args) {
		String string = "assdfffgghveggs";
		//�����3�μ�����
		String regex = "(.)\\1{2,}";
		//String regex = "(.)\\1+";
		String[] splits = string.split(regex);
		System.out.println(splits.length);
		for (String split : splits) {
			System.out.println(split);
		}
	}
}
