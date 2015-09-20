package com.exxample.regex;
/*
 * �и��ַ���Demo
 * 
 */
public class RegexDemo4 {
	public static void main(String[] args) {
		split1();
		split2();
		split3();
		split4();
		split5();
	}
	
	//�и�"D:\\BaiduYunDownload\\day26_regex\\src\\cn\\itcast_03"
	private static void split5() {
		System.out.println("----------------------------------");
		String string = "D:\\BaiduYunDownload\\day26_regex\\src\\cn\\itcast_03";
		String regex = "\\\\";
		String[] splits = string.split(regex);
		for (String split : splits) {
			System.out.println(split);
		}
	}
	// �и�"  aa      bb                 vv"
	private static void split4() {
		System.out.println("----------------------------------");
		String string = "  aa         bb                      vv";
		String regex = " +";
		String[] splits = string.split(regex);
		for (String split : splits) {
			System.out.println(split);
		}
	}

	//����" " �и� "aa bb cc"
	private static void split3() {
		System.out.println("----------------------------------");
		String string = "aa bb cc";
		String regex = " ";
		String[] splits = string.split(regex);
		for (String split : splits) {
			System.out.println(split);
		}
	}

	//����"."�ָ�"aa.bb.cc"  Ҫ����� "\\." ֻ��".��ʧ��"
	private static void split2() {
		System.out.println("----------------------------------");
		String string = "aa.bb.cc";
		String regex = "\\.";
		String[] splits = string.split(regex);
		for (String split : splits) {
			System.out.println(split);
		}
	}

	// ���� "," �и� "aa,bb,cc"  
	private static void split1() {
		System.out.println("----------------------------------");
		String string = "aa,bb,cc";
		String regex = ",";
		String[] splits = string.split(regex);
		for(String split : splits){
			System.out.println(split);
		}
	}
	
	
	
	
}
