
public class Xxx {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
//		var cat = new Cat(); �� ���ٰ� ����ȴ�. �׷��� var��� Cat�� Ŭ���������� �����°��̸�, Cat�ȿ� �ִ� ���븸 �����´ٴ� �ǹ̷� ����.
//		���������� String ~~ �̶�� ���ڿ� ~~�� ��´�, ���� �ǹ̶�� �����ϸ�ȴ�.
		
		cat1.name = "�߿���";
		cat1.age = 3;
		cat1.info();
		cat2.name = "ŰƼ";
		cat2.age = 10;
		cat2.info();
	}
}
