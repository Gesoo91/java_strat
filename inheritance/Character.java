package inheritance;

public class Character extends GameObj {
	
	// String name;
	int hp;
	
	public Character(String name,int grade,int hp) {//super();없이도 됐던 것은 자동으로 삽입되기때문이다.
		super(name,grade);	//super 함수는 무조건 맨 처음에 와야함. 룰임. this가 자신을 가르킨다면 super는 부모를 가르킴. 부모생성자 함수 호출
		this.hp = hp;
	}

}
