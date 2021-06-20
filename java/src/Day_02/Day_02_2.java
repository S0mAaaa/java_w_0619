package Day_02;

public class Day_02_2 {
	public static void main(String[] args) {
		// 변수
			// 1. 변하는 수 <---> 상수(고정된 수)
			// 2. 메모리 : 자원 [ 데이터 저장소 ]
				// 변수 형태:
					// 사람 : 문자    int 변수명;
					// 컴퓨터 : 숫자  메모리 크기 주소값;
			// 3. 자료형 : 미리 정의된 메모리 크기 [ 메모리 효율적 ]
				// 1비트 : 0, 1
				// 1byte : 8비트 => 0 혹은 1 이 8자리
				// 1kb 1024byte // 1024kb => mb => gb
		
				// boolean : 1 비트 : 논리 [ 0(false) & 1(true) ]
				// char : 2비트 : 문자 [ 아스키코드 ]
				// byte : 1byte : 정수 
				// short : 2byte : 정수
				// int : 4byte : 정수
				// long : 8byte : 정수
				// float : 4byte : 실수
				// double : 8byte : 실수
		
		
		//예제 1
			// 1. 변수 선언
				// 자료형 변수명;
				// 자료형 변수명 = 값;
		
		boolean bool = true; // true 혹은 false 만 저장가능
		System.out.println("boolean 변수: " + bool);
		
		System.out.println("===========================");
		
		char ch = 'a'; //
		System.out.println("char 변수: " + ch);
			// char : 아스키코드 사용
			// 문자열 => String
		char ch2 = 100;
		System.out.println("char 변수: " + ch2);
		
		System.out.println("===========================");
		
		byte bt = 100;
		System.out.println("byte 변수: " + bt);
		byte bt2 = 'a';
		System.out.println("byte 변수: " + bt2);
		
		System.out.println("===========================");
		
		short sht = 300;
		System.out.println("short 변수: " + sht);
		short sht2 = 'a';
		System.out.println("short 변수: " + sht2);
		
		System.out.println("===========================");
		
		int i = 3000;
		System.out.println("int 변수: " + i);
		int i2 = 'a';
		System.out.println("int 변수: " + i2);
		// 정수의 기본 자료형은 int 
		System.out.println("===========================");
		
		long lo = 99999999999L;
		System.out.println("long 변수: " + lo);
			// 데이터L;
		System.out.println("===========================");
		
		float fl = 10.51111111111111111111F;
		System.out.println("float 변수: " + fl);
			// 데이터F;
		
		System.out.println("===========================");
		
		double db = 10.511111111111111111111111111111111111111111111111111111111;
		System.out.println("double 변수: " + db);
			// 실수의 기본 자료형은 double
		System.out.println("===========================");
		
		String str = "안녕하세요.";
		System.out.println("String 객체: " + str);
		
		
		
	}
}
