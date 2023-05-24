package com.textrpg;

public class Character {
	String name;
	int hp;
	int attack;
//	Character(String x,int y,int z){<-character클래스의 생성자 //String name;<-문자열 저장 변수 //int hp;<-정수값 저장 변수 
	Character(String name,int hp,int attack){ //매개변수와 멤버 변수의 이름값을 일치하여 this를 쓰는게 더 좋고, 매개변수를 보고 무슨 값인지 알기 좋게 쓰는게 더 좋다. this생략도 가능
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	
	void info() {
		System.out.println("name:"+this.name+"\n"+"hp:"+this.hp+"\n"+"공격력:"+attack);
	}
}
