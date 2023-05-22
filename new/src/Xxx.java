
public class Xxx {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
//		var cat = new Cat(); 과 같다고 보면된다. 그러나 var대신 Cat이 클래스명으로 나오는것이며, Cat안에 있는 내용만 가져온다는 의미로 쓴다.
//		마찬가지로 String ~~ 이라면 문자열 ~~만 담는다, 같은 의미라고 생각하면된다.
		
		cat1.name = "야옹이";
		cat1.age = 3;
		cat1.info();
		cat2.name = "키티";
		cat2.age = 10;
		cat2.info();
	}
}
