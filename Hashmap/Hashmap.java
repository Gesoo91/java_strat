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
