package chapter02.ex01;

public class Ex09 {

	public static void main(String[] args) {
		// for 문 : 조건이 true일 동안 실행 블락을 반복해서 처리, 조건이 false면 for문을 빠져나옴
		/*
		 for (초기값;조건;증각식){
		 		실행블락;			//조건이 true일 동안 반복, false이면 빠져나옴
		 		}
		
		 */
		//1. for 문의 기본 구조 (println)
		int a;		//변수a는 전역변수다 
		for (a=0; a < 3 ; a++) {		// 변수를 블락밖에서 선언 
			System.out.println(a);
		}		//0 ,1 ,2
			
		System.out.println("--------------------------------");
		for (int b = 0; b < 100; b++) {	//변수 b는 지역변수다 for 블락 내에서만 사용됨
			System.out.print( b + " ");
		}
			System.out.println("-----------------------------");
		
		for ( a= 0; a <20; a+=3 ) {
			System.out.print(a + " ");
		}
		System.out.println( );
		System.out.println("--------------------------------");
		for (int b =0; b < 20 ; b+=4) {
			System.out.print(b + " ");
		}
		
		System.out.println( );
		System.out.println("---------------------------");
		//초기값 100부터 1씩빼면서 조건 i > 0 
		for (int i = 100; i > 0; i-=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("------------------------");
		for (int i = 1000;  i > 0  ; i-=10) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		// 여려개의 변수를 초기식 및 증감식에서 처리 가능
		for(int i = 0 , j = 0; i < 100 ;i++, j++) {
			System.out.print(i + " , " + j);
		}
			System.out.println();
			System.out.println("------------------");
			
		//문제 : i * j = 1 단 출력 
		//	    1 * 1 	
			System.out.println("1단 출력");
		for (int i = 1 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}
		System.out.println("------------------");
			System.out.println("2단 출력");
		for (int i = 2 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}	
		System.out.println("------------------");
			System.out.println("3단 출력");
		for (int i = 3 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}	
		System.out.println("------------------");
			System.out.println("4단 출력");
		for (int i = 4 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}	
		System.out.println("------------------");
			System.out.println("5단 출력");
		for (int i = 5 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}	
		System.out.println("------------------");
			System.out.println("6단 출력");
		for (int i = 6 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}	
		System.out.println("------------------");
			System.out.println("7단 출력");
		for (int i = 7 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}			
		System.out.println("------------------");
			System.out.println("8단 출력");
		for (int i = 8 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}	
		System.out.println("------------------");
			System.out.println("9단 출력");
		for (int i = 9 , j=1; j < 10; j++) {	
			System.out.println(i+" * " + j + " = " + i*j  );
		}	
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
