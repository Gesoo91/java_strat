package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
 public static void main(String[] args) {
	HashMap<String, String> hs = new HashMap<>(); // 맵시리즈, 키-밸류, id ,중복은 못넣음
//	HashMap<String, Product> as = new HashMap<>();
	hs.put("m-s-001","개");
	hs.put("m-s-002","고양이");
	hs.put("m-s-003","사자");
//	as.put("m-s-001",""); //코드값,상품 이런식으로 넣음.
//	hs.get("m-s-001").
	String cat = hs.get("m-s-001");
	System.out.println(cat);
	System.out.println(hs.size());
	
	//에러발생 ->여기서 hs는 덩어리가 아닌 것으로 처리됨. 그래서 아래에서 덩어리화를 해줌. 무난히 쓰는건 ArrayList지만 index말고 개별로 꺼낼땐 이것도 있다. 
//	for(String s:hs) {
//		
//	}
	
	Set<String> keys = hs.keySet();
	//Set
	
	for(String s:keys) {
		System.out.println(s);
		System.out.println(hs.get(s));
	}//순서가없음.
	
 }
}

/*
List:
	ArrayList	// 순서(index) 있는 배열				
	Vector	// 성능차이만 있음				
	LinkedList	// 성능차이만 있음				
					
Set:
	HashSet	// 순서 없는 집합, 중복저장이 안됨		꺼낼 때 귀찮게	이런식
		Iterator<String> it = s.iterator();
		System.out.println("-while, next() 으로 꺼내기-");
		while(it.hasNext()) {
			String s1 = it.next();
			System.out.println(s1);
		}
			으로 꺼내야함
	TreeSet	// 성능차이만 있음	이진 탐색 트리(BinarySearchTree) 구조			
					
Map:
	HashMap	// 키, value 형태로 저장하는 배열	-나중에 중요한 개념으로 써먹으니 기억해두기.(데이터접근시)			
	Hashtable	// 성능차이만 있음				
*/