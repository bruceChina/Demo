package com.example.net;
/*
 * 获取主机的地址和名称
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDemo1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getByName("WIN-EB459VPLJ36");
	//	InetAddress inetAddress = InetAddress.getByName("192.168.1.102");
		System.out.println(inetAddress.getHostName());
		System.out.println(inetAddress.getHostAddress());
	}
}
