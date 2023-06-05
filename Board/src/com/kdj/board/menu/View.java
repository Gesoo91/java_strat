package com.kdj.board.menu;

import com.kdj.board.data.*;
import com.kdj.board.util.Sc;

public class View {
	static void run() {
		System.out.println("글보기");
		
		String cmd = Sc.r("글번호를 입력하세요");
		int targetNo = Integer.parseInt(cmd); //cmd로 입력된 문자열을 정수로 변환하는 역할.
		boolean found = false;
		
		for(Data v : DataBox.list) {
			if(v.instenceNo == targetNo) {
				if(!v.isHidden()) {
				v.datainforead();
				found = true;
				}
			else {
				System.out.println("해당글은 삭제되었습니다.");
				found = true;
				}
				break;
			}
			}
		if(!found) {
			System.out.println("해당 번호의 글을 찾을 수 없습니다.");
			
		}
	}
}
