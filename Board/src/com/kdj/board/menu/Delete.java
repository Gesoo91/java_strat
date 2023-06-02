package com.kdj.board.menu;

import com.kdj.board.data.DataBox;
import com.kdj.board.util.Sc;

public class Delete { //삭제할 때 바로 삭제하면 문제가 생길 수 있음. 따라서 우선 찾은다음에 안보이게하거나 해야함.
	static void run() {
		System.out.println("글지우기");
	//삭제할 글 찾기
	String cmd = Sc.r("삭제할 번호 입력");
	int searchNo = 0;
	for(int d=0;d<DataBox.list.size();d++) {
		if(cmd.equals(DataBox.list.get(d).instenceNo+"")) {
			searchNo = d;
			
			}
		}
	//삭제진행
	DataBox.list.remove(searchNo);
	System.out.println("남은 글 갯수는"+DataBox.list.size()+"개 입니다.");
	}		
	
}
