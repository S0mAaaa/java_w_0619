package Day_01;

public class Day_01_1 {
	// Object Ŭ�����κ��� ������ ���� ����
	   // ��� Ŭ������ Object�� ���� ���۵ȴ�
	      // 100% Ŭ���� ��� == 100% ��ü���� ���
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		//System : �ý��� ���� [�����] Ŭ����
		// . : Ŭ������ ��� ���� ������ [Ư����ȣ]
		// out : ��°��� ��Ʈ��
		System.out.println("Java");
		
		// ����1 : println [ �ڵ� �ٹٲ� ���� ]
		System.out.println(7); // ������ ����ó�� X
		System.out.println("java"); // ���ڿ��� ���� ó��
		System.out.println("java7"); // ���� ���ڿ��� ���� ó��
		
		// ����2 : print [ �ڵ� �ٹٲ� ���� X ]
		System.out.print(7);
		System.out.print("java");
		System.out.print("java7");
		
		// ����3 : printf [ ���� = ���� = ���²ٹ̱� = format��� ]
		System.out.printf("%d", 7);
		System.out.printf("%s", "java");
		System.out.printf("%s", "java7");
		
		// ����4 : print , printf ����
		System.out.println("java" + 7 + "�Դϴ�.");
				// + ���ϱ� ������ : ���� + ���� ���
				// + ���� ������ : ���� + ���� ��� Ȥ�� ���� + ����
		System.out.printf("%s%d%s", "java", 7, "�Դϴ�.");
		System.out.printf("java%d�Դϴ�.", 7);
				// ���� ����
					// \ : ��ȭ ��ȣ
					// \n : �ٹٲ�
					// \t : �鿩����
					// \r : ���� [ ������ ���� ]
					// \\ : \
					// \" : "
		
		// ����5 : �����
		System.out.println("\n" + 7 + "\n" + "java\njava7");
		System.out.println("\t" + 7 + "\t" + "java\tjava7");
		
		// ����1 : println
		System.out.println("=============�⼮��=============");
		System.out.println("�̸� " + "\t" + "1����" + "\t" + "2����" + "\t" + "3����");
		System.out.println("���缮" + "\t" + "�⼮" + "\t" + "�Ἦ" + "\t" + "�⼮");
		System.out.println("��ȣ��" + "\t" + "�Ἦ" + "\t" + "�⼮" + "\t" + "�⼮");
		System.out.println("==============================");
		
		// ����2 : printf
		System.out.printf("=============%s=============\n", "�⼮��");
		System.out.printf("%s\t%s\t%s\t%s\n","�̸�", "1����", "2����", "3����");
		System.out.printf("%s\t%s\t%s\t%s\n", "���缮", "�⼮", "�Ἦ", "�⼮");
		System.out.printf("%s\t%s\t%s\t%s\n", "��ȣ��", "�Ἦ", "�⼮", "�⼮");
		System.out.printf("==============================\n");
		
		
		
	}
}
