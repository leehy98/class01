package chapter02.ex01;

public class Ex11 {

	public static void main(String[] args) {
		// for문 내의 for문 : 2중 for 문
		// for문 사용해서 구구단 출력
		
		//밖 for 문 : 단을 출력하는 변수
		//i * j = i * j
		for(int i=1; i < 20 ; i++) {
			
			// 
			System.out.println(i+"단 출력");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j +" = " + i*j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
