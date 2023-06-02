package com.kdj.board.menu;
import com.kdj.board.data.Data;
import com.kdj.board.data.DataBox;
import com.kdj.board.util.Sc;
public class Whiting {
	static void run() {
// cmd값을 매번 줘야되니까 전체가 쓸 수 있게 따로 빼기.
		
//		1.글쓴이 2.글제목 3.본문 순서대로 적게하기
		String writer;
		while(true) {
			writer = Sc.r("글쓴이");
			if(writer.length()>0) {
				break;
			}
			else {
				System.out.println("작성자를 입력하세요");
			}
		}
		String title;
		while(true) {
			title = Sc.r("글제목");
			if(title.length()>0) {
				break;
			}
			else {
				System.out.println("제목을 입력하세요");
			}
		}
		String content;
		while(true) {
			content = Sc.r("본문");
			if(content.length()>0) {
				break;
			}
			else {
				System.out.println("내용을 입력하세요");
			}
		}
		Data data = new Data(writer, title, content, 0);
		DataBox.list.add(data);
		System.out.println("작성이 완료되었습니다.");
	}
}
