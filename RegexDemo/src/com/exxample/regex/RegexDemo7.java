package com.exxample.regex;
/*
 * ����:  ����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
 * ���ַ�����ԭ��:����Ҫѧ��̡���
 * �ⷨ :	 
 * 		1 ��"."ȥ��
 * 		2 ���ʱ���һ����       
 * 		
 */
public class RegexDemo7 {
	public static void main(String[] args) {
		String string = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		string = string.replaceAll("\\.", "");
		
		System.out.println(string);
		
		String regex = "(.)\\1+";
		//$1��ʾ��һ�������
		string = string.replaceAll(regex, "$1");
		System.out.println(string);
	}
}
