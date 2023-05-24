package com.textrpg;

public class Monster {
	String name;
	int hp;
	int attack;
	
	Monster(String name,int hp,int attack){
		this.name=name;
		this.hp=hp;
		this.attack=attack;
	}
	void info() {
		System.out.println("name:"+this.name+"\n"+"hp:"+this.hp+"\n"+"공격력:"+attack);
	}
}
