package Day_01;

public class Day_01_1 {
	// Object 클래스로부터 데이터 제공 받음
	   // 모든 클래스는 Object로 부터 시작된다
	      // 100% 클래스 언어 == 100% 객체지향 언어
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		//System : 시스템 관련 [입출력] 클래스
		// . : 클래스내 멤버 접근 연산자 [특수기호]
		// out : 출력관련 스트림
		System.out.println("Java");
		
		// 예제1 : println [ 자동 줄바꿈 포함 ]
		System.out.println(7); // 수에는 문자처리 X
		System.out.println("java"); // 문자에는 문자 처리
		System.out.println("java7"); // 문자 숫자에는 문자 처리
		
		// 예제2 : print [ 자동 줄바꿈 포함 X ]
		System.out.print(7);
		System.out.print("java");
		System.out.print("java7");
		
		// 예제3 : printf [ 형식 = 서식 = 형태꾸미기 = format출력 ]
		System.out.printf("%d", 7);
		System.out.printf("%s", "java");
		System.out.printf("%s", "java7");
		
		// 예제4 : print , printf 차이
		System.out.println("java" + 7 + "입니다.");
				// + 더하기 연산자 : 숫자 + 숫자 경우
				// + 연결 연산자 : 문자 + 숫자 경우 혹은 문자 + 문자
		System.out.printf("%s%d%s", "java", 7, "입니다.");
		System.out.printf("java%d입니다.", 7);
				// 제어 문자
					// \ : 원화 기호
					// \n : 줄바꿈
					// \t : 들여쓰기
					// \r : 게헹 [ 앞으로 가기 ]
					// \\ : \
					// \" : "
		
		// 예제5 : 제어문자
		System.out.println("\n" + 7 + "\n" + "java\njava7");
		System.out.println("\t" + 7 + "\t" + "java\tjava7");
		
		// 문제1 : println
		System.out.println("=============출석부=============");
		System.out.println("이름 " + "\t" + "1교시" + "\t" + "2교시" + "\t" + "3교시");
		System.out.println("유재석" + "\t" + "출석" + "\t" + "결석" + "\t" + "출석");
		System.out.println("강호동" + "\t" + "결석" + "\t" + "출석" + "\t" + "출석");
		System.out.println("==============================");
		
		// 문제2 : printf
		System.out.printf("=============%s=============\n", "출석부");
		System.out.printf("%s\t%s\t%s\t%s\n","이름", "1교시", "2교시", "3교시");
		System.out.printf("%s\t%s\t%s\t%s\n", "유재석", "출석", "결석", "출석");
		System.out.printf("%s\t%s\t%s\t%s\n", "강호동", "결석", "출석", "출석");
		System.out.printf("==============================\n");
		
		
		
	}
}
