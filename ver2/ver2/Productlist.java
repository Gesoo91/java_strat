package com.kdj.kiosk.ver2;

import java.util.ArrayList;

public class Productlist {
	public static Product menu1 = new Product("아이스 아메리카노", 3500); //todo = 갯수가 늘어나면 쓰기 힘드니까 list에 집어넣을 수 있게 작업하기.그list를 다른 클래스에 넣어서 관리
	public static Product menu2 = new Product("핫 아메리카노", 3000);
	public static Product menu3 = new Product("마카롱",6000);
	public static ArrayList<Product> basket = new ArrayList<Product>(); // 어레이 리스트로 장바구니 만들기.임포트해줘야함 //todo : 주문하는 부분 따로 class만들어주기
}
