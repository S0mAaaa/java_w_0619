package Day_02;

import java.util.Scanner;

public class Day_02_3 {
	public static void main(String[] args) {
		
		
		// �Է¹ޱ�
			// 1. �Է¹ޱ� => ������ ���� => ���
		
		Scanner scan = new Scanner(System.in);
			// Scanner : �Է� ���� Ŭ����
				//scan : ��ü�� vs ������
					// new : ��ü�� �޸� �Ҵ� ������
						// Scanner(System.in) : Ŭ���� ������
		System.out.print("���� �Է�: ");
		int inputnum = scan.nextInt();
						// nextInt() : �Է°�ü�� �Էµ� ���� ��������
		System.out.println("���� �Է��� ������ " + inputnum + " �Դϴ�.");
		
		System.out.print("���ڿ� �Է�: ");
		String inputstr = scan.next();
						// next() : �Է°�ü�� �Էµ� ���ڿ� ��������
		System.out.println("���� �Է��� ���ڿ��� " + inputstr + " �Դϴ�.");
	}
}
