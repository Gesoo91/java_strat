package com.kdj.board.menu;

import com.kdj.board.util.*;
public class Menu {

	public void run() {
	loop:
		while(true) {
			String cmd = Sc.r("입력");
			switch(cmd) {
			case "1":
				Whiting.run();
				break;
			case "2":
				List.run();
				break;
			case "3":
				View.run();
				break;
			case "4":
				Delete.run();
				break;
			case "5": //수정하기 추가
				Revise.run();
				break;
			case "e":
				System.out.println("종료합니다.");
				break loop;
			default:
				System.out.println("재입력해주세요."+"\n"+"1.글쓰기 2.글목록 3.글보기 4.글지우기 e.종료");
			}
		}
	}
}
