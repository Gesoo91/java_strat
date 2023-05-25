package com.kdj.kiosk;
import java.util.ArrayList;
import java.util.Scanner;
public class Kiosk {
	public static Scanner sc = new Scanner(System.in); //static을 줘서 다른 클레스에서도 사용가능하게 변경
	public static Product menu1 = new Product("아이스 아메리카노", 3500);
	public static Product menu2 = new Product("핫 아메리카노", 3000);
	public static Product menu3 = new Product("마카롱",6000);
	public static ArrayList<Product> basket = new ArrayList<Product>(); // 어레이 리스트로 장바구니 만들기.임포트해줘야함
	public static String cmd;
//	ArrayList<집어넣을 클래스 형> x = new ArrayList<String>(); //뒤에 <>는 생략가능
//	x.add 더하기 x.set 바꾸기 x.remove 제거하기,배열 갯수도 줄어듬 x.clear 싹다지움, 갯수도 0 ...
//	x.add("고양이"); x.add("ㅇㅇ"); x.set(1,"호랑이");
//	for(int i=0;i<x.size();i++){} -> size는 갯수
//	x[0]=고양이 부터 순차적으로 입력됨.
	
//	이클립스 : 변수명등을 일괄적으로 바꾸기 : alt + shift + r
	void run() { //kiosk부분 옮기고 run추가해서 실행하게하기
	loop_a:
	while(true) {
		System.out.println("[1.음료 / 2.디저트 / e.종료]");
		cmd = sc.next();
		Drink drink = new Drink();
		Dessert dessert = new Dessert();
		switch(cmd) {
			case "1":
				drink.run();
			break;
			case "2":
				dessert.run();
			break; // switch문의 break를 잘 쓰자. 나중에 쓰려니까 헷갈린다.
			case "e":
				int count = basket.size();
				System.out.println("장바구니에 담긴 상품 갯수:"+count);
				
				int sum = 0;
				for (Product x: basket) { //for문 향상성있게 쓰기.for (element_type element : iterable_object) {반복될 코드}
					//인덱스 변수를 사용하지 않아도 요소에 접근가능하여 배열이나 컬렉션 순회할때 유용하고 요소를 읽기만 할때 적합하다.
					sum = sum+x.Price;
				}
//				for(int i=0;i<basket.size();i=i+1) { //기존식
//					sum = sum + basket.get(i).Price;
//				}
				System.out.println("계산하실 금액은 :"+sum+"원 입니다.");
				break loop_a;
		}
	}
	System.out.println("키오스크가 종료됩니다.");
}
}