package jdbc;

import java.util.Scanner;

public class DAOTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("******�λ�����ý���*******");
		System.out.println("1. �μ����");
		System.out.println("2. �μ�������ȸ");
		System.out.println("3. �μ���������");
		System.out.println("4. �μ�����");
		System.out.println("5. ���μ���� Ȯ���ϱ�");
		System.out.println("6. �μ��� ��� ��� Ȯ��");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int choice = key.nextInt();
		show(choice);
	} 
	public static void show(int choice) {
		MenuUI ui = new MenuUI();
		switch(choice) {
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.selectdeptMenu();
				break;
			case 3:
				ui.updateMenu();
				break;
			case 4:
				ui.deleteMenu();
				break;
			case 5:
				ui.selectMenu();
				break;
			case 6:
				ui.empoMenu();
				break;
		}
	}
}
