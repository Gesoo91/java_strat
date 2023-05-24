package com.textrpg;

public class Main {
	public static void main(String[] args) {
//	Character user_cha = new Character();
		Character user_cha = new Character("human",100,10);
		Character sub_cha = new Character("elf",100,10);
		Character hidden_cha = new Character("dark elf",100,10); // new Character에 마우스 오버 해보면 뭘 넣어야될지 이름이 보이니까 더 좋다.
	Monster xx = new Monster("slime",30,3);
	
	user_cha.info();
	sub_cha.info();
	hidden_cha.info();
	xx.info();
//	클래스 이름을 캐릭터이름으로 하면 더 편할거같다. Character human = new Character("human",100,10); 같이 xx도 몬스터이름으로
	}
}
