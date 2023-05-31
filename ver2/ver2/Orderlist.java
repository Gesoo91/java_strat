package com.kdj.kiosk.ver2;

import java.util.HashSet;
import java.util.Set;

public class Orderlist {
	public void run(){
		 Set<String> uniqueMenuSet = new HashSet<>(); // 중복 상품 체크를 위한 Set
//		Product menuname =  Productlist.basket.get();
	for (Product y: Productlist.basket) {
		String menuName = y.Menu;	
		 if (uniqueMenuSet.contains(menuName)) {
             continue; // 이미 중복된 상품이라면 다음 상품으로 넘어감
         }
		int menuCounting = 0;
		for (Product nextProduct : Productlist.basket) {
	        if (menuName.equals(nextProduct.Menu)) {
	            menuCounting++; // 중복된 값이 있을 때마다 menuCounting을 증가
	        }
	    }
		if(menuCounting > 0) {
			System.out.println("담아두신 상품:"+menuName+"는"+menuCounting+"개 입니다.");
		}
		 uniqueMenuSet.add(menuName); // 중복 체크를 위해 Set에 상품명 추가
	}
	//todo : 중복 주문시 갯수로 추가하기. 아아4개 시키면 담아두신상품:아이스 아메리카노 4개 이렇게 나오게
	int count = Productlist.basket.size();
	System.out.println("장바구니에 담긴 상품 갯수:"+count);
	
	int sum = 0;
	for (Product x: Productlist.basket) { //for문 향상성있게 쓰기.for (element_type element : iterable_object) {반복될 코드}
		//인덱스 변수를 사용하지 않아도 요소에 접근가능하여 배열이나 컬렉션 순회할때 유용하고 요소를 읽기만 할때 적합하다.
		sum = sum+x.Price;
	}
//	for(int i=0;i<basket.size();i=i+1) { //기존식
//		sum = sum + basket.get(i).Price;
//	}
	System.out.println("계산하실 금액은 :"+sum+"원 입니다.");
	}
}
	
