package com.rcp01;

import java.util.Scanner;

public class Rpc01 {
	void run() {
		//void는 차후 설명예정		
		int com = 0;
		
		//int player = 1;//플레이어의 값을 입력받아서 게임실행하기로 변경
		Scanner sc = new Scanner(System.in); 
		//에러발생. Scanner 클래스가 타입이 정의되지 않음. import하여 사용(추후에 설명) 내장클래스 중에 그냥 사용가능한게 있고 이렇게 만든 녀석은 임포트 필요한듯
//		ctrl+shift+o = 자동 임포트 단축키  혹은 마우스 오버해서 임포트 클릭
//		에러는 실행불가, 빨간불  오류는 실행은가능
		
		String cmd = sc.next();
//		sc를 실행하면 입력대기상태가 된다.
//		System.out.println(cmd); //실행시켜보면 console에서 입력가능, 입력하면 입력값 나온다.
		
//		ctrl+m 은 전체화면
		String result = "";
		
		xx:
		while(true) {

			System.out.println("가위 바위 보~!");
			System.out.println("==x를 치면 게임 종료~!==");	
			com = (int)(Math.random()*3+1); //java에서 랜덤값 받기. 1~3나오게 함. 가위=1, 바위=2, 보=3
			
			switch(cmd) {
			case "가위":
				switch(com) {
				case 1:
					result = "비겼다!";
					break;
				case 2:
					result = "졌다!";
					break;
				case 3:
					result = "이겼다!";
					break;
				}
				break;
			case "바위":
				switch(com) {
				case 1:
					result = "이겼다!";
					break;
				case 2:
					result = "비겼다!";
					break;
				case 3:
					result = "졌다!";
					break;
				}
				break;
			case "보":
				switch(com) {
				case 1:
					result = "졌다!";
					break;
				case 2:
					result = "이겼다!";
					break;
				case 3:
					result = "비겼다!";
					break;
				}
				break;
			case "x":
				break xx;
			}
			String comStr = "";
			switch(com) {
			case 1:
				comStr = "가위";
				break;
			
			case 2:
				comStr = "바위";
				break;
		
			case 3:
				comStr = "보";
				break;
	}
			System.out.println("내가 낸 것:"+cmd);
			System.out.println("컴퓨터가 낸 것:"+comStr);
			System.out.println("결과:"+result);
			cmd = sc.next();
		}
		System.out.println("게임 종료!");
	}
}
