package com.kdj.kiosk.ver2;
import java.util.Scanner;
public class Kiosk {
	public static Scanner sc = new Scanner(System.in); //static을 줘서 다른 클레스에서도 사용가능하게 변경
	
	public static String cmd;
	
	//main에서 실행할 부분
	void run() {
	loop_a:
	while(true) {
		System.out.println("[1.음료 / 2.디저트 / e.종료]");
		cmd = sc.next();
		Drink drink = new Drink();
		Dessert dessert = new Dessert();
		Orderlist order = new Orderlist();
		switch(cmd) {
			case "1":
				drink.run();//drink부분 출력
			break;
			case "2":
				dessert.run();//dessert부분 출력
			break; 
			case "e":
				order.run();
				break loop_a;
		}
	}
	System.out.println("키오스크가 종료됩니다.");
}
}
