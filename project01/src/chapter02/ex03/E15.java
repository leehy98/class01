package chapter02.ex03;

public class E15 {

	public static void main(String[] args) {
		// arr1 배열 변수에 정수 1000개의 방 생성 
		// for문 사용해서 각 방에3의 배수 값을 저장
		// for문 사용해서 출력
		int [] arr1 = new int[1000];
		for(int i = 0, j= 3; i<1000; i+=3) {
			arr1[i]= i;	
		}
		
		for(int i = 0; i<1000;i+=3) {
			System.out.print(arr1[i] + " " );
		}
	}

}
