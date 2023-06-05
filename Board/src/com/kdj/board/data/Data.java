package com.kdj.board.data;

import java.time.LocalDate;

public class Data {
	static public int no = 0;
	public int instenceNo = 0;
	public String writer;
	public String title;
	public String content;
	public int hit = 0;
	public String date;
	public boolean hidden;
	public Data (String writer, String title, String content, int hit) {
		no = no + 1;
		instenceNo = no;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.hit = hit;
		LocalDate now = LocalDate.now();
		date = now.toString();
		this.hidden = false;
	}
	public void hide() {
		hidden = true;
	}
	public void show() {
		hidden = false;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void datainfolist() {
		System.out.println("글번호"+instenceNo);
		System.out.println("글쓴이"+writer);
		System.out.println("글제목"+title);
		System.out.println("조회수"+hit);
		System.out.println("작성일"+date);
	}
	public void datainforead() {
		System.out.println("글번호"+instenceNo);
		System.out.println("글쓴이"+writer);
		System.out.println("글제목"+title);
		System.out.println("본문"+content);
		System.out.println("조회수"+hit);
	}
}
