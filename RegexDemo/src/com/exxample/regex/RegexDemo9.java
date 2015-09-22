package com.exxample.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ÌáÈ¡ÍøÒ³Â·¾¶
 * 
 */
public class RegexDemo9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("net.htm"));
		String string = null;
		String regex = "(http|https)://((\\w{2,8}\\.)+\\w{2,8})(/\\w+)+";
		while((string = br.readLine()) != null){
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(string);
			if (matcher.find()) {
				System.out.println(matcher.group());
			}
		}
		br.close();
	}
}
