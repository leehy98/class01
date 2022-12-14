package chapter02.ex01;

public class Ex02 {

	public static void main(String[] args) {
		// 자동 타입 변환 (업캐스팅) vs 수동타입 변환 (다운캐스팅) 
		// 1. 자동타입 변환 (업캐스팅: 낮은 자료형에서 높은 자료형으로 자동으로 변환 )
			// byte -> short -> int -> long -> float -> double 
		
		float vlaue1 = 3 ; //3은 int -> float 업캐스팅되서 들어감 
 		long value2 = 5 ; // int -> long 으로 자동 업캐스팅
		double value3 = 7 ; //int -> double 으로 자동 업캐스팅
		
		System.out.println(vlaue1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("------------------------------------");
		
		//2. 수동으로 타입 변환 (다운 캐스팅 : 높은 자료형에서 낮은 자료형으로 변환)
		int value4 = (int)3.5; // double -> int 다운캐스팅 
		float value5 = 7.8f;   // double -> float 다운캐스팅 
		
		System.out.println(value4);
		System.out.println(value5);
		
		
		
		
		
		
		
		
	}

}
