package Day_02;

public class Day_02_1 {
	
	// ctrl + spacebar
	public static void main(String[] args) {
		
		// 연산자
		// 1. 산술연산자
			// +더하기 -빼기 *곱하기 /나누기 %나머지
		System.out.println(5 + 3);
		System.out.println(5 - 3);
		System.out.println(5 * 3);
		System.out.println(5 / 3);
		System.out.println(5 % 3);
		
		System.out.println("===========================");
		
		// 2. 비교연산자 [ 결과 : True / False ]
		System.out.println(5 > 3); // 초과 true
		System.out.println(5 >= 3); // 이상 true
		System.out.println(5 < 3); // 미만 false
		System.out.println(5 <= 3); // 이하 false
		System.out.println(5 == 3); // 같다 false
		System.out.println(5 != 3); // 같지않다 true
		
		System.out.println("===========================");
		System.out.println("예제");
		
		// 문제1
		System.out.println(3 % 2 == 1);
		
		// 문제2
		System.out.println(36 % 3 == 0);
		
		// 홀수/짝수 판단
			//값 % 2 == 0 : 나머지가 0이면 값은 짝수
			//값 % 2 == 1 : 나머지가 1이면 값은 홀수 
		// 배수 판단
			// 값 % 수 == 0 : 나머지가 0이면 해당 값은 그 수의 배수
		
		System.out.println("===========================");
		
		// 3. 관계연산자 [ 비교 연산자 2개 이상일 경우 ]
			// and : && 비교연산자 모두 True 일때 True 출력
			// or : || 비교연산자 둘중 하나라도 True 이면 True 출력
			// 부정 : ! True => False & False => True
		
		System.out.println((1 < 3 && 3  < 5)); 
		System.out.println(1 < 3 || 3 < 2);
		System.out.println(!(1 < 3)); // 원래는 True, ! 때문에 False로 출력
		
		System.out.println("===========================");
		
		// 4. 대입연산자
			// = 대입 [ 오른쪽 값 => 왼쪽으로 대입 ]
			// += -= *= /= %=
		int a = 10;
		a += 10; // a = a + 10;
		
		System.out.println("===========================");
		
		// 5. 증감연산자
			// ++ : 1증가
			// -- : 1감소
		System.out.println(++a); // 출력 전 증가
		System.out.println(a++); // 출력 후 증가
		System.out.println( a );
		
		System.out.println(--a); // 출력 전 감소
		System.out.println(a--); // 출력 후 감소
		System.out.println( a );

		System.out.println("===========================");
		System.out.println("예제");
		
		int money = 365420;
		System.out.println("money = 365,420원");
		System.out.println("십만원권: " + (money/100000));
		System.out.println("만원권: " + (money%100000)/10000);
		System.out.println("천원권: " + (money%10000)/1000);
		System.out.println("백원: " + (money%1000)/100);
		System.out.println("십원: " + (money%100)/10);
			
		
		
	}
}
