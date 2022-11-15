package chapter02.ex01;

import java.util.Arrays;

public class Ex19 {

	public static void main(String[] args) {
		// Enhanced for :배열의 각방의 값을 출력 할떄 쉽게 출력 할 수 있다/
		//		0 ~ 마지막 방까지 한꺼번에 출력
		
		int []arr1 = new int [100];
		
		//for 문을 사용 해서 7의 배수만 저장
		for (int i = 0 , j=7; i <100 ;i++, j+=7 ) {
			arr1[i]=j;
		}
		
		//각방의 내용을 for 문을 사용해서 출력
		for (int i =0 ; i <100 ; i++) {
			System.out.print(arr1[i]+" ");
			}
		System.out.println();
		
		System.out.println("------향상됨 for 문 : Enhanced For-----");
		// 0 번방 ~ 마지막 방까지 모두 출력 
		for (int k: arr1) {
			System.out.print( k + " ");
		}
		
		System.out.println();
		System.out.println("------ Arrays.toString(배열변수) -----");
		//Arrays.toString(arr3);	배열 변수에 저장된 모든값을 출력
			//Arrays : 객체
			//toString () : 메소드(함수) 
				//메소드 : 객체 지향언어에서 함수를 메소드 (method) 라고 호칭한다
		System.out.println(Arrays.toString(arr1)); //배열 변수의 값을 출력
		
		
		
		
	}	

}
