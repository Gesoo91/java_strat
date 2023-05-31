package com.kdj.kiosk.ver2;


public class Dessert {
	public void run() {
		System.out.println("[ 디저트선택 ]");
		Productlist.menu3.info();
	loop_c:
	while(true) {
		System.out.println("1.마카롱 / x.돌아가기");
		Kiosk.cmd = Kiosk.sc.next();
		switch(Kiosk.cmd) {
		case "1":
			System.out.println("아이스 아메리카노 하나가 담겼습니다.");
			Product z = new Product("마카롱",6000);
			Productlist.basket.add(z);
			break;
		case "x":
			break loop_c;
			}
		}
	}

}
