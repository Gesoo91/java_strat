package com.rcp01;

import java.util.Scanner;

public class Rpc01 {
	void run() {
		//void�� ���� ������		
		int com = 0;
		
		//int player = 1;//�÷��̾��� ���� �Է¹޾Ƽ� ���ӽ����ϱ�� ����
		Scanner sc = new Scanner(System.in); 
		//�����߻�. Scanner Ŭ������ Ÿ���� ���ǵ��� ����. import�Ͽ� ���(���Ŀ� ����) ����Ŭ���� �߿� �׳� ��밡���Ѱ� �ְ� �̷��� ���� �༮�� ����Ʈ �ʿ��ѵ�
//		ctrl+shift+o = �ڵ� ����Ʈ ����Ű  Ȥ�� ���콺 �����ؼ� ����Ʈ Ŭ��
		String cmd = sc.next();
//		sc�� �����ϸ� �Է´����°� �ȴ�.
//		System.out.println(cmd); //������Ѻ��� console���� �Է°���, �Է��ϸ� �Է°� ���´�.
		
//		ctrl+m �� ��üȭ��
		String result = "";
		
		xx:
		while(true) {

			System.out.println("���� ���� ��~!");
			System.out.println("==x�� ġ�� ���� ����~!==");	
			com = (int)(Math.random()*3+1); //java���� ������ �ޱ�. 1~3������ ��. ����=1, ����=2, ��=3
			
			switch(cmd) {
			case "����":
				switch(com) {
				case 1:
					result = "����!";
					break;
				case 2:
					result = "����!";
					break;
				case 3:
					result = "�̰��!";
					break;
				}
				break;
			case "����":
				switch(com) {
				case 1:
					result = "�̰��!";
					break;
				case 2:
					result = "����!";
					break;
				case 3:
					result = "����!";
					break;
				}
				break;
			case "��":
				switch(com) {
				case 1:
					result = "����!";
					break;
				case 2:
					result = "�̰��!";
					break;
				case 3:
					result = "����!";
					break;
				}
				break;
			case "x":
				break xx;
			}
			String comStr = "";
			switch(com) {
			case 1:
				comStr = "����";
				break;
			
			case 2:
				comStr = "����";
				break;
		
			case 3:
				comStr = "��";
				break;
	}
			System.out.println("���� �� ��:"+cmd);
			System.out.println("��ǻ�Ͱ� �� ��:"+comStr);
			System.out.println("���:"+result);
			cmd = sc.next();
		}
		System.out.println("���� ����!");
	}
}
