package chapter02.ex01;

public class Ex01 {

	public static void main(String[] args) {
		// 타입변환 (캐스팅) 
		// 1. 캐스팅 방법 1 
		
		
		int value1 = (int) 5; //int 정수값만 넣을수 있다
		long value2 = (long) 10.0000034;
		
		float value3 = (float) 5.8; //캐스팅 필요
		double value4 = (double) 10.50;
			System.out.println(value1); //
			System.out.println(value2);
			System.out.println(value3);
			System.out.println(value4);
			
			System.out.println("====================");
			 //2 캐스팅 (1, L   /  f , F) long ,float
			//long float 의 정의된 변수에 값을 할당 할떄 캐스팅 해서 넣어야 한다.
			// 정수 : int , 실수 : double 
			long value5 = 10L ;
			long value6 = 20l ;
			float value7 = 5.8f ; 	
			float value8 = 5.8F ; 
			
			System.out.println(value5);
			System.out.println(value6);
			System.out.println(value7);
			System.out.println(value8);
	}	

}
