package com.kdj.board.util;

import java.util.Scanner;

public class Sc {
	public static Scanner sc = new Scanner(System.in); 
	public static String r(String commant) {
		System.out.println(commant+":");
		return sc.next();
	}
	
}
