package lecture;

import java.util.Scanner;
public class kimsam_exception1_Prob1 {
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str= scan.nextLine();
		int result= 0;
		try {
			convert(str);
		}catch(IllegalArgumentException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ���ڿ��� �Է����� �ʰ� EnterŰ�� �����̽��ϴ�.");
		}
	}
	
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	private static int convert(String str) throws IllegalArgumentException{
		int con = Integer.parseInt(str);
		if(str.length() == 0 | str ==null) {
		throw new IllegalArgumentException();
		}
		System.out.println("��ȯ�� ���ڴ�"+ con+" �Դϴ�.");
		return con;
	}
}