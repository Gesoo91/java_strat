package com.kdj.kiosk;
import java.util.ArrayList;
import java.util.Scanner;
public class Kiosk {
	Product menu1 = new Product("아이스 아메리카노", 3500);
	Product menu2 = new Product("핫 아메리카노", 3000);
	Product menu3 = new Product("마카롱",6000);
	
	ArrayList<Product> basket = new ArrayList<Product>(); // 어레이 리스트로 장바구니 만들기.임포트해줘야함
	
	
	Scanner sc = new Scanner(System.in);
	String cmd;
	void run() { //kiosk부분 옮기고 run추가해서 실행하게하기
	loop_a:
	while(true) {
		System.out.println("[1.음료 / 2.디저트 / e.종료]");
		cmd = sc.next();
		switch(cmd) {
			case "1":
				System.out.println("[ 음료선택 ]");
				menu1.info();
				menu2.info();
				loop_b:
				while(true) {
					System.out.println("1.아이스 아메리카노 / 2.핫 아메리카노 / x.돌아가기");
					cmd = sc.next(); // 이걸 빼먹으면 위쪽에서 들어온 입력값이 계속 입력되서 무한반복이된다.
					switch(cmd) {
					case "1":
						System.out.println("아이스 아메리카노 하나가 담겼습니다.");
						Product x = new Product("아이스 아메리카노",3500); //프로덕트에 있는 녀석들만 담을수잇게
						basket.add(x); // 어레이리스트에 담기
						break;
					case "2":
						System.out.println("핫 아메리카노 하나가 담겼습니다.");
						Product y = new Product("핫 아메리카노",3000);
						basket.add(y);
						break;
					case "x":
						break loop_b;
					}
				}
			break;
			case "2":
				System.out.println("[ 디저트선택 ]");
				menu3.info();
			loop_c:
			while(true) {
				System.out.println("1.마카롱 / x.돌아가기");
				cmd = sc.next();
				switch(cmd) {
				case "1":
					System.out.println("아이스 아메리카노 하나가 담겼습니다.");
					Product z = new Product("마카롱",6000);
					basket.add(z);
					break;
				case "x":
					break loop_c;
				}
			}
			break; // switch문의 break를 잘 쓰자. 나중에 쓰려니까 헷갈린다.
			case "e":
				int count = basket.size();
				System.out.println("장바구니에 담긴 상품 갯수:"+count);
				
				int sum = 0;
				for(int i=0;i<basket.size();i=i+1) {
					sum = sum + basket.get(i).Price;
				}
				System.out.println("계산하실 금액은 :"+sum+"원 입니다.");
				break loop_a;
		}
	}
	System.out.println("키오스크가 종료됩니다.");
}
}