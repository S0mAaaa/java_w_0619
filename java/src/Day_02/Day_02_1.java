package Day_02;

public class Day_02_1 {
	
	// ctrl + spacebar
	public static void main(String[] args) {
		
		// ������
		// 1. ���������
			// +���ϱ� -���� *���ϱ� /������ %������
		System.out.println(5 + 3);
		System.out.println(5 - 3);
		System.out.println(5 * 3);
		System.out.println(5 / 3);
		System.out.println(5 % 3);
		
		System.out.println("===========================");
		
		// 2. �񱳿����� [ ��� : True / False ]
		System.out.println(5 > 3); // �ʰ� true
		System.out.println(5 >= 3); // �̻� true
		System.out.println(5 < 3); // �̸� false
		System.out.println(5 <= 3); // ���� false
		System.out.println(5 == 3); // ���� false
		System.out.println(5 != 3); // �����ʴ� true
		
		System.out.println("===========================");
		System.out.println("����");
		
		// ����1
		System.out.println(3 % 2 == 1);
		
		// ����2
		System.out.println(36 % 3 == 0);
		
		// Ȧ��/¦�� �Ǵ�
			//�� % 2 == 0 : �������� 0�̸� ���� ¦��
			//�� % 2 == 1 : �������� 1�̸� ���� Ȧ�� 
		// ��� �Ǵ�
			// �� % �� == 0 : �������� 0�̸� �ش� ���� �� ���� ���
		
		System.out.println("===========================");
		
		// 3. ���迬���� [ �� ������ 2�� �̻��� ��� ]
			// and : && �񱳿����� ��� True �϶� True ���
			// or : || �񱳿����� ���� �ϳ��� True �̸� True ���
			// ���� : ! True => False & False => True
		
		System.out.println((1 < 3 && 3  < 5)); 
		System.out.println(1 < 3 || 3 < 2);
		System.out.println(!(1 < 3)); // ������ True, ! ������ False�� ���
		
		System.out.println("===========================");
		
		// 4. ���Կ�����
			// = ���� [ ������ �� => �������� ���� ]
			// += -= *= /= %=
		int a = 10;
		a += 10; // a = a + 10;
		
		System.out.println("===========================");
		
		// 5. ����������
			// ++ : 1����
			// -- : 1����
		System.out.println(++a); // ��� �� ����
		System.out.println(a++); // ��� �� ����
		System.out.println( a );
		
		System.out.println(--a); // ��� �� ����
		System.out.println(a--); // ��� �� ����
		System.out.println( a );

		System.out.println("===========================");
		System.out.println("����");
		
		int money = 365420;
		System.out.println("money = 365,420��");
		System.out.println("�ʸ�����: " + (money/100000));
		System.out.println("������: " + (money%100000)/10000);
		System.out.println("õ����: " + (money%10000)/1000);
		System.out.println("���: " + (money%1000)/100);
		System.out.println("�ʿ�: " + (money%100)/10);
			
		
		
	}
}
