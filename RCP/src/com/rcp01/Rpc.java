package com.rcp01;
import java.util.Scanner;

public class Rpc {
	void run() {
		Scanner sc = new Scanner(System.in);
		int r = 0;
		String cmd = "";
		String result = "";
		
		xx:
		while(true) {
			System.out.println("���������� ��! [����=x] :");
			cmd = sc.next();
			r = (int)(Math.random() * 3 + 1);	//1~3
			switch(cmd) {
			case "����":
				switch(r) {
				case 1:
					result = "���";
					break;
				case 2:
					result = "��";
					break;
				case 3:
					result = "�̱�";
					break;
				}
				break;
			
			case "����":
				switch(r) {
				case 1:
					result = "�̱�";
					break;
				case 2:
					result = "���";
					break;
				case 3:
					result = "��";
					break;
				}
				
				break;
			case "��":
				switch(r) {
				case 1:
					result = "��";
					break;
				case 2:
					result = "�̱�";
					break;
				case 3:
					result = "���";
					break;
				}
				
				break;
			case "x":
				// ���̶�� ������� 
				// ���� xx: ��� ǥ��(��)�� �ϸ� 
				// �ٷ� ���� while�� (for�� ������) �� ���� �Ű����� �ǰ�
				// break �� continue �� ��� �� �ڿ� �󺧸��� ���̸�
				// �ڽ��� ���� ���� ��� �ݺ��� �Ǵ� switch �����
				// switch �������� break �� �ƴ� while ���� break�� �۵��ϰ� ��.
				break xx;
			}
			System.out.println(result);
			//todo ���� �� �´��� ǥ���ϸ� �� ����..
		}
		System.out.println("���α׷� ����");
	}
}
