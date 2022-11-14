package chapter02.ex01;

public class Ex10 {

	public static void main(String[] args) {
		// FOR문의 특수한 형태 (무한루프)
		// for문에서 조건이 생략될 경우 무한루프
		// ----- 초기식 조건 증감식이 빠진 경우도 무한루프
		//
		/*
		for (int i =0 ; ; i++) {		조건이 생략되면서 무한루프 <메모리가 풀: 서버 다운
			System.out.print(i + " ");
		}
		*/
		/*
		for(;;) {		                    모두 생략된 경우
			System.out.println("무한루프");
		}
		*/
		System.out.println("===================");
		//무한루프 탈출 : break; 
		for (int i = 0; ; i++) {
			System.out.println(i + " ");
			
			if (i > 100) {
				break;		//break; 는 if 조건과 같이 사용한다.
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
