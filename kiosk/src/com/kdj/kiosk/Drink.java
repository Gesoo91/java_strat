package com.kdj.kiosk;
// 음료수 부분 따로 빼서 코드분리.
public class Drink {
	public void run() {
		Util.ln("[ 음료선택 ]");
		Kiosk.menu1.info();
		Kiosk.menu2.info();
		loop_b:
		while(true) {
			System.out.println("1.아이스 아메리카노 / 2.핫 아메리카노 / x.돌아가기");
			Kiosk.cmd = Kiosk.sc.next(); // 이걸 빼먹으면 위쪽에서 들어온 입력값이 계속 입력되서 무한반복이된다.
			switch(Kiosk.cmd) {
			case "1":
				System.out.println("아이스 아메리카노 하나가 담겼습니다.");
				Product x = new Product("아이스 아메리카노",3500); //프로덕트에 있는 녀석들만 담을수잇게
				Kiosk.basket.add(x); // 어레이리스트에 담기
				break;
			case "2":
				System.out.println("핫 아메리카노 하나가 담겼습니다.");
				Product y = new Product("핫 아메리카노",3000);
				Kiosk.basket.add(y);
				break;
			case "x":
				break loop_b;
			}
		}
	}
}
