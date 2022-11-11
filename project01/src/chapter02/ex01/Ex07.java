package chapter02.ex01;

public class Ex07 {

	public static void main(String[] args) {
		// IF 구문 사용하기 
		//1. type 1 : if (조건) { 실행문 : 조건이 참일떄 실행 ; }
			// {} 를 생략 가능한데, 생략될 경우 실행문 1개만 적용 
		int value1 = 5;
		if (value1 > 3) {
			//조건이 참일떄 실행블락 
			System.out.println("실행1"); //조건이 참이므로 실행됨
		}
		//조건이 거짓일떄
		
		if (value1 < 3) {
			//조건이 거짓일떄 실행블락 
			System.out.println("실행2"); //조건이 거짓이므로 실행x
		}
		
		System.out.println("-----{조건이 참일때 실행문} , {}생략가능 ---------");
		 	//if 조건에서 실행문이 하나일때 {} 생략 가능 
		if (value1 < 3 ) 
			System.out.println("실행3");	//실행문 1개만 { } 가 생략되어서 처리될 수 있다. 
			System.out.println("실행4"); 
		
		//type 2 : if (조건) { 조건이 참일떄 실행; } else { 조건이 거짓일떄 실행; }	
			// 삼항 연산자로 변환 
			
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("------- if를 사용해서 출력 ----------");
		if (bool1) {
			//조건이 참일대 실행
			System.out.println("참");
			
		}else {
			//조건이 거짓일때 실행
			System.out.println();
		}
				
		System.out.println("-------삼항 연산자를 사용해서 출력-------");	
		System.out.println((bool2) ? "참" : "거짓");	
			
		//type 3 : 조건이 여러개인 경우 : 
		//if (조건1) { 조건1이 참일대 실행 } 
		//else if (조건2) { 조건2가 참일때 실행}
		//else if (조건3) { 조건3가 참일때 실행}
		//...
		//else {위 조건에 존재하지 않는 경우 실행}
		System.out.println("--------------------------");
	
	int value3 = 85; 	
	
	if (value3 >= 90) {	
		System.out.println("a학점");	
	} else if (value3 >= 80) {	
		System.out.println("b학점"); //if문을 빠져나온다. 실행후 탈출
	} else if (value3 >= 70) {	
		System.out.println("c학점");
	} else if (value3 >= 60) {
		System.out.println("d학점");
	} else {
		//위 조건이 모두 만족하지 않으면 실행 
		System.out.println("f학점");
	}	
	
	System.out.println("-----------------조건을 거꾸로 조정------------------");
		
	if (value3 >= 70) {			//실행후 탈출
		System.out.println("C학점");
	}else if (value3 >=80) {
		System.out.println("B학점");
	}else if (value3 >=90) {	
		System.out.println("A학점");
	}else {
		System.out.println("F학점");
	}
		
	System.out.println("-----------------조건을 디테일하게 조정------------------");	
		
	if( value3 >=60 & value3 < 70 ) {	
		System.out.println("D학점");
	}else if (value3 >= 70 && value3 <80 ) {
		System.out.println("C학점");
	}else if (value3 >= 80 && value3 <90) {	
		System.out.println("B학점");
	}else if (value3 >= 90 && value3 <100  ) {
		System.out.println();
	}else if (value3 >=0 && value3 < 60 ) {
		System.out.println("F학점");
	}else {
		System.out.println("정확한 점수가 아닙니다. 0 ~ 100 까지만 넣어주세요");	
			
	}		
			
			
			
			
			
	}		
}			
			
	
			
			
			
			



