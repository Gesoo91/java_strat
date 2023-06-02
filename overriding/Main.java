package overriding;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Son son = new Son();
		Son2 son2 = new Son2();
		Son3 son3 = new Son3();
		
		ArrayList<Father> sons = new ArrayList<>();
//		부모로 형변환 했을때 자신의 함수를 못쓰는데, 오버라이딩 해두면 형변환된 상태에서도 자신의 함수를 쓴다. 
		sons.add(son);
		sons.add(son2);
		sons.add(son3);
		
		for (Father f : sons) {
			f.kimchi();
		}
//		son.kimchi();
//		오버라이딩 한 함수는 부모의 것과 자신의 것 모두를 실행할 수 있다.
//		인터페이스를 배우면 거기서도 오버라이딩을 많이 쓴다.
	}
}