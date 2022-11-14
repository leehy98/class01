package chapter02.ex01;

public class Ex13 {

	public static void main(String[] args) {
		// do ~ while 문 : 실행문을 조건과 상관없이 한번은 실행을 시킨후 조건에 따라 반복 
		// while 문 : 조건에 맞아야 실행 블락을 실행 
		
		/* while 문
		 	초기식; 
		 	while (조건) {
		 		실행블락;
		 		증감식;
		 	}
		 		
		 */
		
		
		/* do while 문
		  초기식 
		  do {
		  	 실행블락;
		  	 증감식 ; 
		 } while (조건);
		 
		  	 
		  	 
		 */
		
		//1. while 문 
		System.out.println("------while------");
		int a = 0 ;
		while (a < 0 ) {			//조건이 false이므로 실행x
			System.out.println(a + " ");
			System.out.println("-----------------------------------");
		}
		//do while 문
		a= 0;
		do {
			System.out.println(a + " ");	//조건과 상관없이 실행문을 반드시 1번 실행 
		}while (a < 0 );
		
		//반복 횟수가 10번인 경우 while 문과 do while 문 비교
		System.out.println("------while문을 사용해서 10번 출력------");
		a = 0 ;
		while (a < 10) {
			System.out.print(a +" ");
			a++;
		}
		System.out.println();
		System.out.println("------do while 문을 사용해 10번 출력------");
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
			
		}while (a < 10 );
;		
		
		
		
		
		
		
		
		
	}

}
