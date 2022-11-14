package chapter02.ex03;

public class E11 {

	public static void main(String[] args) {
		// 2중 for 문 사용해 1~ㄷ9ㄴ 출력 pirnt /t
		// 
		System.out.println("--------println---------------");
		for (int i =1  ; i < 10 ; i++) {
			System.out.print(i+"단"+" \n");
			
			for (int j = 1; j < 10 ; j++) {
				System.out.print(i+" * "+j+" = "+i*j +"\t");
				
			}
			System.out.println();
		}
		//printf()를 사용해 출력 부분을 간결하게 처리 
		System.out.println("---------------printf------------------");
		for (int i =1  ; i < 10 ; i++) {
System.out.print(i+"단"+" \n");
			
			for (int j = 1; j < 10 ; j++) {
				System.out.printf("%d * %d = %d \t",i,j,i*j);
		}
			System.out.println();
	}
	}	
}	
