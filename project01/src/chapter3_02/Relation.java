package chapter3_02;

public class Relation {

	public static void main(String[] args) {
		// 크기비교 연산 vs 등가 비교 연산자
		
		//1. 크기비교 연산 (< , > <= , >= ) ----> ture, false 
		System.out.println(5 > 2); //ture
		System.out.println(5 < 2); //ture
		
		System.out.println(5 >= 5); //ture
		System.out.println(5 <= 5); //ture
		
		System.out.println("----------------------------");
		
		//2. 등가 비교 연산자 ( == , != ) ---> ture, false
			//값이 같은지 다른지를 비교하는 연산자 	
			//stack 메모리의 값을 비교
			//stack 에 값이 저장되는 것은 기본 자료형
			// ==	: 값이 같을떄 ture 다를때 false
			// !=	: 값이 다를때 ture 같을때 flase
		int a = 5;
		int b = 2;	
		int c = 5;
		System.out.println(a == c); // ture 
		System.out.println(a == b); // false
		
		System.out.println(a != b);	// ture 
		System.out.println(a != c); // false
		
		System.out.println("---------------------------------");
		
		
		//참조 자료형 일때 (Heap 영역에 값이 저장, stack 영역에는 Heap 에 번지 수가 들어있다.)
		//	   stack 영역		       Heap 영역
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1);
		System.out.println(str2);
		
			//stack 영역의 값을 비교  : == 
		System.out.println(str1 == str2);	//false
		
		
		//참조 영역에서 값을 비교 할때 ? .equals() 사용해서 값을 비교함.
			//Heap 영역의 값을 비교 할떄는 .equals() 를 사용해야한다.
		
		//개체변수 .equals(객체변수2) : Heap 영역의 값을 비교 
		System.out.println(str1 .equals(str2)); 
		
		
		
		
		
		
		
		
		
		
		
	}

}
