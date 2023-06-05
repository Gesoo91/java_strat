package com.kdj.board.menu;

import com.kdj.board.data.Data;
import com.kdj.board.data.DataBox;
import com.kdj.board.util.Sc;

public class Delete { //삭제할 때 바로 삭제하면 문제가 생길 수 있음. 따라서 우선 찾은다음에 안보이게하거나 해야함.
	static void run() {
		System.out.println("글지우기");
	//삭제할 글 찾기
	String cmd = Sc.r("삭제할 번호 입력");
	int searchNo = -1; //DataBox에 없는 숫자 입력시 오류라고 말하기 + 배열의 첫번째 요소를 삭제한 경우 이 값이 0으로 변경되어 삭제된거라고 오해하지않도록 0에서 -1로 변경
	for(int d=0;d<DataBox.list.size();d++) {
		if(cmd.equals(DataBox.list.get(d).instenceNo+"")) {
			searchNo = d;
			break;
			}
		}
	if(searchNo != -1) {
	DataBox.list.get(searchNo).hide();
	System.out.println("남은 글 갯수는"+ getVisibleCount() +"개 입니다.");
		}
	else {
		System.out.println("해당 번호의 글을 찾을 수 없습니다.");
		}
	}//run부분 끝.
	
	//삭제햇다고하고 감춘다음에 삭제된척 보여주기.
	static int getVisibleCount() {
		int count = 0;
		for(Data data : DataBox.list) {
			if(!data.isHidden()) {
				count++;
			}
		}
		return count;
	}
	//삭제진행
//	DataBox.list.get(searchNo).hide();
//	System.out.println("남은 글 갯수는"+DataBox.list.size()+"개 입니다.");
}		
	

