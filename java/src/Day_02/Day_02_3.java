package Day_02;

import java.util.Scanner;

public class Day_02_3 {
	public static void main(String[] args) {
		
		
		// 입력받기
			// 1. 입력받기 => 변수에 저장 => 사용
		
		Scanner scan = new Scanner(System.in);
			// Scanner : 입력 관련 클래스
				//scan : 객체명 vs 변수명
					// new : 객체의 메모리 할당 연산자
						// Scanner(System.in) : 클래스 생성자
		System.out.print("정수 입력: ");
		int inputnum = scan.nextInt();
						// nextInt() : 입력객체의 입력된 정수 가져오기
		System.out.println("현재 입력한 정수는 " + inputnum + " 입니다.");
		
		System.out.print("문자열 입력: ");
		String inputstr = scan.next();
						// next() : 입력객체의 입력된 문자열 가져오기
		System.out.println("현재 입력한 문자열은 " + inputstr + " 입니다.");
	}
}
