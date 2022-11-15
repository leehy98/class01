package chapter02.ex03;

import java.util.Scanner;

public class E17 {

	public static void main(String[] args) {
		// 스캐너로 배열 방 갯수를 인풋 받는다
		//배열 변수 arr1 ,2 의 배수를 저장후 출력 Enhanced for 문으로 사용
		//배역 변수 arr1 ,3 의 배수를 인풋 받아서 출력 , for 문을 사용해 출력
		//arr1.length 배열의 방의 갯수를 자동으로 알아옴
		Scanner sc = new Scanner(System.in);
		System.out.println("방의 갯수 입력");
		int a = sc.nextInt();
		
		int[]arr1 = new int [a];
		int[]arr2 = new int [a];
		for(int i=0, j=2; i< arr1.length; i++, j+=2 ) {
			arr1[i]=j;
		}
		for(int i=0, j =3; i< arr2.length; i++ ,j+=3) {
			arr2[i]=j;
		}
		
		System.out.println("Enhanced for 문으로 2의 배수 출력 arr1");
		
		for(int k: arr1) {
			System.out.print(k+ " ");
		}
		
		
		System.out.println();
		System.out.println("Enhanced for 문으로 3의 배수 출력 arr2");
		for (int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		
		
		
	}
		

}
