package com.exxample.regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ�ı��ļ������䲢����ʾ����
 * ����:
 * 		1  ���ı��ĵ�
 * 		2 ����arraylist
 * 		3 ��дƥ����ʽ
 * 		4 ��ȡ�ı�������ƥ��
 * 		5 ���沢����ʾ
 */
public class RegexDemo8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("mail.txt"));
		ArrayList<String> mails = new ArrayList<>();
		String string = null;
		String regex = "\\w+@\\w{2,8}(\\.\\w{2,8})+";
		//"\\1" ƥ��������������� abc1@sina.com.com 
		//String regex = "\\w+@\\w{2,8}(\\.\\w{2,8})\\1+";
		
		while((string = br.readLine()) != null){
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(string);
			if(matcher.find()){
				mails.add(matcher.group());
			}
			
		}
		br.close();
		
		for (String mail : mails) {
			System.out.println(mail);
		}
	}
}
