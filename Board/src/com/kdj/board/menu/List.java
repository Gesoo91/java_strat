package com.kdj.board.menu;

import com.kdj.board.data.*;

public class List {
	static void run() {
		System.out.println("글목록");		
		for(Data l:DataBox.list) {
			if (!l.isHidden()) {//숨겨진것 안나오게 하기.
				l.datainfolist();
			}
		}
	}
}
