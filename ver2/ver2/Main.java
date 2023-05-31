package com.kdj.kiosk.ver2;

//todo: 장바구니에 담긴 상품 목록 나오게 하기, 
public class Main {
	public static final String VERSION = "0.0.11";	//버전 표시용.
	
	public static void main(String[] args) {
		Kiosk run = new Kiosk(); //새로 만든 class kiosk
		run.run();
	}
}