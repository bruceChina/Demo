package com.exxample.regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 读取文本文件里邮箱并且显示出来
 * 步骤:
 * 		1  打开文本文档
 * 		2 创建arraylist
 * 		3 编写匹配表达式
 * 		4 读取文本并进行匹配
 * 		5 保存并且显示
 */
public class RegexDemo8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("mail.txt"));
		ArrayList<String> mails = new ArrayList<>();
		String string = null;
		String regex = "\\w+@\\w{2,8}(\\.\\w{2,8})+";
		//"\\1" 匹配的内容是这样的 abc1@sina.com.com 
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
