package chapter02.ex03;

public class E14 {
	public static void main(String[] args) {
		//배열선언 4가지 방법
		//1. 배열 변수 이름 : arr1, 정수로 방 3개 지정 , 40,50,60 넣고 출력 1번째 방법
		//2. 배열 변수 이름 : arr2  실수로 방 5개 지정 , 40.0,50.0,60.0 넣고 출력 2번째 방법
		//3. 배열 변수 이름 : arr3  문자열로 방 5개 지정 , "오늘:" "날씨" "흐림" 출력3번째 방법
		//4/ 배열 변수 이름 : arr4	 문자3 'A' 'B' 'C'4번째 방법 4번째 방법
		
		System.out.println("----1번째 방법-----");
		int[] arr1 = new int[3];
		arr1[0]= 40;
		arr1[1]= 50;
		arr1[2]= 60;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println();
		System.out.println("------------2번째 방법-----------");
		System.out.println();
		
		
		double[]arr2;
		arr2 = new double [5];
		
		arr2 [0] = 40.0;
		arr2 [1] = 50.0;
		arr2 [2] = 60.0;
		arr2 [3] = 70.0;
		arr2 [4] = 80.0;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		
		
		System.out.println();
		System.out.println("------------3번째 방법-----------");
		System.out.println();
		
		
		String[] arr3 = new String [] {"오늘","날씨","흐림"};
		System.out.print(arr3[0]);
		System.out.print(arr3[1]);
		System.out.print(arr3[2]);
		
		System.out.println();
		System.out.println();
		System.out.println("------------4번째 방법-----------");
		System.out.println();
		
		char[]arr4 = {'A','B','C'};
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		
		
		
		
		
		
		
		
		
	}
}
