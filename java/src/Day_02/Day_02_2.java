package Day_02;

public class Day_02_2 {
	public static void main(String[] args) {
		// ����
			// 1. ���ϴ� �� <---> ���(������ ��)
			// 2. �޸� : �ڿ� [ ������ ����� ]
				// ���� ����:
					// ��� : ����    int ������;
					// ��ǻ�� : ����  �޸� ũ�� �ּҰ�;
			// 3. �ڷ��� : �̸� ���ǵ� �޸� ũ�� [ �޸� ȿ���� ]
				// 1��Ʈ : 0, 1
				// 1byte : 8��Ʈ => 0 Ȥ�� 1 �� 8�ڸ�
				// 1kb 1024byte // 1024kb => mb => gb
		
				// boolean : 1 ��Ʈ : �� [ 0(false) & 1(true) ]
				// char : 2��Ʈ : ���� [ �ƽ�Ű�ڵ� ]
				// byte : 1byte : ���� 
				// short : 2byte : ����
				// int : 4byte : ����
				// long : 8byte : ����
				// float : 4byte : �Ǽ�
				// double : 8byte : �Ǽ�
		
		
		//���� 1
			// 1. ���� ����
				// �ڷ��� ������;
				// �ڷ��� ������ = ��;
		
		boolean bool = true; // true Ȥ�� false �� ���尡��
		System.out.println("boolean ����: " + bool);
		
		System.out.println("===========================");
		
		char ch = 'a'; //
		System.out.println("char ����: " + ch);
			// char : �ƽ�Ű�ڵ� ���
			// ���ڿ� => String
		char ch2 = 100;
		System.out.println("char ����: " + ch2);
		
		System.out.println("===========================");
		
		byte bt = 100;
		System.out.println("byte ����: " + bt);
		byte bt2 = 'a';
		System.out.println("byte ����: " + bt2);
		
		System.out.println("===========================");
		
		short sht = 300;
		System.out.println("short ����: " + sht);
		short sht2 = 'a';
		System.out.println("short ����: " + sht2);
		
		System.out.println("===========================");
		
		int i = 3000;
		System.out.println("int ����: " + i);
		int i2 = 'a';
		System.out.println("int ����: " + i2);
		// ������ �⺻ �ڷ����� int 
		System.out.println("===========================");
		
		long lo = 99999999999L;
		System.out.println("long ����: " + lo);
			// ������L;
		System.out.println("===========================");
		
		float fl = 10.51111111111111111111F;
		System.out.println("float ����: " + fl);
			// ������F;
		
		System.out.println("===========================");
		
		double db = 10.511111111111111111111111111111111111111111111111111111111;
		System.out.println("double ����: " + db);
			// �Ǽ��� �⺻ �ڷ����� double
		System.out.println("===========================");
		
		String str = "�ȳ��ϼ���.";
		System.out.println("String ��ü: " + str);
		
		
		
	}
}
