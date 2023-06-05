package com.kdj.board;
//menu를 다른 페키지에 만들어서 전체임포트해줌.
import com.kdj.board.menu.*;


/* =========================ver.0===============================================
 * 기본 셋팅.게시판의 큰 구조 만들었음. cmd로 입력값 적게 하고 switch문으로 각 탭 실행하게 함. 
 * todo : 글쓰기(Whiting)부분 만들기. 입력값 저장되게해서 배열에 넣어두면 될듯. 
 * menu 패키지가 필요한가에 대한 고민.(상속으로 각 탭들을 묶으려했는데 비슷한 형태의 매개변수가 쓰이는 일이 없어 필요가 없을 듯 하다.)
 *  =========================ver.1===============================================
 * menu 패키지에 대한 고찰. Main과 Board만 두고 실행. Menu에서 각 탭들의 기능 실행.(Board -> Menu) 
 * util 패키지 새로 만들어서 입력값 cmd 부분 따로 처리
 * writing 부분 완료.
 * 입력된 writing을 data로 저장하기 위해 data 패키지 만들고 data에 입력될 값 지정. DataBox에 ArrayList 만들어서 list에 저장
 * 이때 객체초기화 안해서 NullPointerException 발생. 객체가 null인 상태에서 객체에 접근하려 할때 발생한다고 함. DataBox의 list가 null상태이고
 * 이 상태에서는 데이터를 추가할 수 없어서 발생한 것으로 추정. DataBox안에서 public static ArrayList<Data> list = new ArrayList<>();으로
 * 객체 초기화.
 * ==========================ver.2================================================
 * List와 View 제작 (List가 DataBox의 list와 헷갈릴 수도 있겟다라고 생각이 듬. 클래스명 앞에 뭐든 붙여두는게 좋을듯.)
 * List안에 for문으로 Data 변수 l 에 Databox.list를 가져와 Post.infoForList()로출력하게 하였다. 
 * View는 글번호를 선택하면 출력하는 형태로 진행한다. 위와 같이 for문으로 list를 가져와서 if문에 cmd.equals가 v.instenceNo+""과 같다면 출력(+""을 하여 int값인 instenceNo를 String으로 받기)
 *============================ver.3===============================================
 *삭제기능 추가. for문으로 DataBox의 size를 측정하여 번호 입력한값과 동일한 instenceNo와 동일한 녀석이 있다면 입력값을 searchNo 값으로 입력
 *이후 DataBox.list.remove(searchNo);하여 해당 배열 삭제한다.
 *그러나 게시판같은것에서 함부러 삭제하는 것은 좋지않으므로 숨김상태로 전환해두는 것이 좋다고한다. 
 *
 *todo : 글 수정기능 추가.
 *todo:boolean값으로 true일때는 숨기는 hide를 만들자.
 *boolean hidden;을 넣고 true일때ㅣ 현상태. false가 되면 writer title content instanceNo 를 모두 초기값으로 돌림.
 *public Data(String writer, String title, String content, int instanceNo) {
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.instanceNo = instanceNo;
        this.hidden = false;
        }
        Delete에서 DataBox.list.get(index).hide(); // 요소를 숨김 상태로 변경 를 주어 감추기 //테스트 아직안함
        
 *============================ver.4================================================
 *수정기능 추가 완료.
 *Board에 5.글수정 추가.
 *Revise클래스에 for문을 통한 데이터박스에서 검색기능 및 글번호 기입하여 선택하게 하기는 동일.
 *if문으로 동일할 때 content값을 입력하고, 그 값이 content가 되도록 함.
 *
 *ver3에서 생각햇던 삭제->한척하고 감춰둠 상태로 만드는 것 구현.
 *hidden값을 주어 boolean true false 상태로 보이기 안보이기 함.
 *List,Delete에서 감춘 것 안보이게 출력되도록 바꿈.
 *List에서는 if문에 isHidden값과 다르다면 출력, 같다면 출력되지않게함.
 *Delete에서는 isHidden값과 다르다면 카운트하는 함수를 추가하여 남은 갯수 나오게 함.
 *View에서는 cmd로 입력된 문자열을 정수로 변환하는 것을 적용. 그 값으로 입력된 글번호를 정확히 비교하게 함.
 *found 변수로 찾는 글의 여부를 나누고 글 삭제, 글없음 등을 구현.
 *
 * */

public class Board {

	public void run() {
//		DataBox.loadData(); //이게 없으면 Exception in thread "main" java.lang.NullPointerException 뜨면서 실행이 안된다. 왜?? null값 초기화가안되서. DataBox에서 직접 초기화코드를 입력하여 이걸 안쓰고 해봣다.
		System.out.println("게시판");
		System.out.println("1.글쓰기 2.글목록 3.글보기 4.글지우기 5.글수정 e.종료"); //todo:글쓰기를 만들어서 글목록에 넣을수 있게 해야함
//		System.out.println("명령:");//Ci확인하면 됨.
//		Menu.run();
		Menu menu = new Menu();
		menu.run();
		
	}
}
