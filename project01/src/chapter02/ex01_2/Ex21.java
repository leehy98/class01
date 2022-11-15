package chapter02.ex01_2;

public class Ex21 {

	public static void main(String[] args) {
		// 기본 데이터 타입과 참조데이터타입의 비교 
		
		//1. 기본 데이터 타입에서 대입연산 (stack 값을 복사 )
		int value1 =3 ;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		
		System.out.println("----------------------------------");
		//2 참조 데이터 타입일때 연산 ( stack의 값(heap 값을 복사)을 복사)
		int []arr1 = new int[] {3,4,5};
		int []arr2= arr1;	//heap이 아닌 arr1의 stack 주소값을 복사
		arr2 [0] = 7;
		
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		System.out.println("--------------------------------");
		
		//객체의 heap 영역의 주소 출력 : String 예외 사항 <-- 객체를 출력하면 객체의 값이 출력
		System.out.println(arr1); //heap 영역의 16진수 hash code <--메모리 주소값
		System.out.println(arr2); // arr1 과 같은값이 출력됨 
		
		
		
	}

}
