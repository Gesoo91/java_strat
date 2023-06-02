package com.kdj.board.menu;

import com.kdj.board.data.*;
import com.kdj.board.util.Sc;

public class View {
	static void run() {
		System.out.println("글보기");
		String cmd = Sc.r("글번호를 입력하세요");
		for(Data v : DataBox.list) {
			if(cmd.equals(v.instenceNo+"")){//instenceNo는 int이기때문에 뒤에+""을 해서 스트링으로 강제적용.
				v.datainforead();
		}
		}
	}
}
