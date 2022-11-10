package chapter01;

public class Consoleoutput {
	
	public static void main(String[] args) {
		//콘솔에서 다양한 출력 방법 
				//1. System.out.println("");  : 출력후 라인은 개행
				//문자열 출력시 "" 처리
		System.out.println("안녕하세요");
		System.out.println("안녕"+"하세요"); // 문자열 + 문자열 : 연결연산자
				//정수, 실수 출력시 "" 처리 x 
				//+ : 더하기 
		System.out.println(2 + 4);
		System.out.println(4.6);
		System.out.println("2" + "4"); // 문자열 2와 문자열 4를 연결해라 
  		System.out.println("문자"+ 1); // + 문자의 연결 
  		System.out.println("문자" + 1 + 2); //문자12
  		System.out.println(1 + 2 + "문자"); //3문자
  		System.out.println("==========변수에 값을 할당후 출력=========");
  			//변수선언 : 자료형 변수명 = 변수의 값
  			int a = 5; //정수형 a 변수에 정수값 5를 넣어라 
  						// = : 오른쪽의 값을 = 왼쪽 변수에 값을 할당해라.
  						// == : 같다.
  			System.out.println(a);  //변수 출력시 "" 처리 x 
  			
  			String b = "하세요"; // String : 문자열 변수 선언시 사용 
  			
  			System.out.println(b);
  			System.out.println("안녕" + b);
  			System.out.println(a + "안녕" + b); //5안녕하세요
  			
  			
  			
  			System.out.println("====================================");
				//2. System.out.print("")     : 출력후 라인을 개행하지 않음
				//\n 엔터 \t 탭
		System.out.print("반갑"); 
		System.out.print("습니다");
		System.out.print(7 + "\n");
		System.out.print("안녕 \t" + "하세요. \n");
		System.out.print("반갑 \t" + "습니다. \n");
		
		
		System.out.println("==================================");
		
				//3. System.out.printf("")    : , 뒤의 변수값을 ""안으로 가져옴
		
		// %d : 뒤의 정수를 불러 올떄 사용 (10진수)
		System.out.printf("오늘의 날짜는 %d 월 %d 일입니다 \n", 11,07);
		
		//%o : 뒤의 8진수 값을 불러올떄 사용  
		System.out.printf("8진수 10을 불러옵니다: %o \n", 10);
		
		//%x : 뒤의 값을 16진수로 불러올떄 사용 
		System.out.printf("뒤의 값을 16진수로 불러 옵니다 %x \n", 10);
		
		//%s : 뒤의 문자열을 가지고 옵니다.
		System.out.printf("%s은 %s가 매우 매우 %s니다 \n", "오늘" , "날씨", "맑습");
		
		//%f : 문자열 뒤의 실수 값을 불러올떄 사용 
		//%4.2f : 4는 전체 4자리, 2는 소숫점이하 2자리까지 잘라서 출력 
		System.out.printf("나의 몸무게는 %fkg입니다 \n", 75.1234567);
		System.out.printf("나의 몸무게는 %4.1f입니다 \n",75.1234567);
		
		System.out.printf("오늘의 온도는 %f도이고, %s %4.2f 입니다", 17.33, "나의 몸무게는", 75.5);
		
		
		
		
		
	}

}
