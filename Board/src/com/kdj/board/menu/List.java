package com.kdj.board.menu;

import com.kdj.board.data.*;

public class List {
	static void run() {
		System.out.println("글목록");		
		for(Data l:DataBox.list) {
			l.datainfolist();
		}
	}
}
