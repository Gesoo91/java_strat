package com.kdj.board.menu;

import com.kdj.board.data.Data;
import com.kdj.board.data.DataBox;
import com.kdj.board.util.Sc;

public class Revise {
	static void run() {
		String cmd = Sc.r("수정할 글 번호를 써주세요.");
			for(Data r : DataBox.list) {
				if(cmd.equals(r.instenceNo+"")) {
					String content = Sc.r("수정할 내용 기입");
					r.content = content;
					System.out.println("수정이 완료되었습니다.");
				}
			}
	}
}
