package com.kdj.kiosk.ver2;

public class Orderlist {
	public void run(){

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
	
