package com.kdj.kiosk;
// 화면구성. 1,2,3번을 이용하여 다음장으로 넘어가는 것.
public class Product {
	String Menu;
	int Price;
//		오버로딩:함수이름 같게하지만 매개변수의 갯수나 형만 달리해서 추가하기
	/*Product(int Price,String Menu) {
		this.Menu = Menu;
		this.Price = Price;
	}
	Product(String Menu) {
		this.Menu = Menu;
		this.Price = 1000;
	}*/	
	Product(String Menu,int Price) {
		this.Menu = Menu;
		this.Price = Price;
	}

	Product(){
		
	}
	public void info() {
		System.out.println(Menu+"가격:"+Price+"원");
	}
}

