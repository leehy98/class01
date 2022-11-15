package chapter02.ex01;

public class Ex18 {
	public static void main(String[] args) {
		//배열에 값을 넣고 출력하기
		
		System.out.println("-----1. 직접 값을 넣고 출력-----");
		//배열 변수 선언 및 방 크기 초기화
		int []arr1 =new int[5];
		
		//직접 해당 번호에 값을 할당 
		arr1[0] =10;
		arr1[1] =20;
		arr1[2] =30;
		arr1[3] =40;
		arr1[4] =50;
		//직접 방의 번호를 출력
		System.out.println(arr1[0] +" "+arr1[1] + " "+arr1[2]+" "+arr1[3]+" "+ arr1[4]);
		
		System.out.println();
		System.out.println("-----2. for문을 사용해 대량으로 값을 넣고 출력-----");
		//arr2 에 방을 100개 선언, for 문을 사용해서 각방에 1부터 시작해서 1씩증가
		int[] arr2 =new int[100];
		//for 문을 사용해 값을 할당 i = index (방번호)
		for(int i =0 ; i<100 ; i++) { //0 ~ 99까지 
			arr2[i] = i + 1;			//각 방의 값을 자동으로 넣는다
			
		}
		//for 문을 사용해서 넣은 값을 출력하기
		for(int i = 0; 0 <100; i++) {
			System.out.print(arr2[i]+" ");
			
			System.out.println("------------배열의 방의 갯수 출력 메소드----------");
			System.out.println(arr1.length); //5
			System.out.println(arr2.length); //100
			
			System.out.println("-------------------");
			for(int c =0; c <arr2.length ; c++) {
				System.out.println(arr2[i]+" ");
			}
		}
		
		
	}
	
}

