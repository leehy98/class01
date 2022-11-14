package chapter02.ex03;

public class E10 {

	public static void main(String[] args) {
		// 2중 for문을 사용해서  1단 ~ 19단까지 출력 
		// 3의 배수단 만 출력 
		for(int i=3 ; i<20; i+=3 ) {
			System.out.println(i+"단 출력");
			for(int j= 3; j<20 ; j++) {
				System.out.println(i+" * "+ j + " = "+i*j);
				
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
