package chapter02.ex01;

public class Ex17 {

	public static void main(String[] args) {
		/*
		 자료형  ; 변수를 선언시 변수의 할당할 값을정의,
		 	-기본 자료형 : boolean ,byte short int long float double char
		 		-메모리의 stack 공간에 변수와 값이 저장
		 	-참조자료형 :	배열 열거 클래스(인터페이스)
		 		-메모리에 stack 공간에 변수명 과 참조주소 (heap 영역에 주소)
		 		-변수의 값은 heap 영역에 저장 
		 변수 - 변수에는 하나의 값만 저장됨
		 	 - 초기값을 할당후 변수를 사용 
		 배열 - 하나의 배열 변수에 많은값을 저장할수있다.
		     - 배열의 특징 :1. 배열변수의 동일한 자료형의 값만 저장 할 수 있다.(int long double)
		     			  2. 배열은 방의개수가정의 되면 수정이 불가능
		     - 초기값을 할당하지 않더라도 강제로 초기값이 할당됨.
		     - heap 공간에는 값이 반드시 할당되어야 한다.		  
		     	ex) boolean (false), 정수[byte short int long](0) , 실수[float dloble](0.0)
		 */
		//1. 변수 - 선언과 동시에 값 할당 
		System.out.println("------------변수------------");
		int a = 10;
		
		//2. 변수 - 선언 이후에 값 할당 
		int b ;		//선언
		b= 20;		//값 할당
		
		//변수를 선언후 초기 값을 할당하지 않고 사용하면 오류 발생 
		int c;
		int d;
		int sum;
		//sum = c+d;	//c d 변수에 초기값을 녛지않고 사용하여 오류발생 
		System.out.println();
		System.out.println("------------------배열 : 선언방법1------------------");
		
		//1. 배열선언 1번째 방법
		int [] age1 = new int [3] ;	//배열을 선언과 동시에 방의 크기를 바로 지정 
		//int[] : 정수 값만 배열에 저장 가능 
		//age1 : 배열 변수 ,age1 변수명은 stack 공간에 저장 ,age1에 heap 영역의 주소값이 저장
		//new : heap 영역에 값을 저장하라는 뜻
		//int [3] : heap 영역에 값을 저장할 방의 갯수
		// 			index : 방의 번호 , 0번부터 할당됨
			//배열에 값할당 .
			age1[0] = 55;		// age1 의 heap 영역의 주소 0번 째 방에 55를 넣어라 
			age1[1] = 66;		// age1 의 heap 영역의 주소 1번 째 방에 66를 넣어라 
			age1[2] = 77;		// age1 의 heap 영역의 주소 2번 째 방에 77를 넣어라 
			// 배열의 값을 출력
			
			//0 번방 값
			System.out.println("0번방 값 : "+age1[0]);
			//1 번방 값
			System.out.println("1번방 값 : "+age1[1]);
			//2 번방 값
			System.out.println("2번방 값 : "+age1[2]);
			
			System.out.println();
			System.out.println("---------------------------");
		int[]age2;			//배열 변수 선언
		age2= new int [5];	//배열 변수의 들어간 방의 갯수 지정 
		
		age2[0] = 5;
		age2[1] = 10;
		age2[2] = 15;
		age2[3] = 20;
		age2[4] = 25;
		System.out.println("0번 방 값 : "+age2[0]);
		System.out.println("0번 방 값 : "+age2[1]);
		System.out.println("0번 방 값 : "+age2[2]);
		System.out.println("0번 방 값 : "+age2[3]);
		System.out.println("0번 방 값 : "+age2[4]);
		
		System.out.println("------------------배열 : 선언방법2------------------");
		
		//배열선언과 방의 크기 할당
		int[] age3 =  new int [4]; //index ; 0,1,2,3
		
		//배열 방에 값 넣기
		age3 [0] = 5;
		age3 [1] = 10;
		age3 [2] = 15;
		age3 [3] = 20;
		//age3 [4] = 25;	//오류 : 예외 발생
							// - 컴파일 시 오류  : 이클립스에서 자동으로 오류를 출력해줌 
							// - 실행시 오류 가 발생 : 예외 처리	
							
		
		// 방 값 출력 
		System.out.println(age3[0]);
		System.out.println(age3[1]);
		System.out.println(age3[2]);
		System.out.println(age3[3]);
		//System.out.println(age3[4]); 오류발생 : 실행시 오류 
		
		//선언과 방번호 분리해서 정의
		int age4[];
		age4 = new int[5];
		
		
		
		System.out.println("------------------배열 : 선언방법3------------------");
		
		// 배열 선언과 동시에 값 할당
		int[] age5 = new int[] {10,20,30,40,50};
		//int[] age6 = new int[5] {10,20,30,40,50};
			// 오류발생: 선언과 동시에 배열 변수에 값을 할당 할떄 방크기를 지정하면 오류 발생
		age5 [3] = 77;
		System.out.println(age5[0]);
		System.out.println(age5[1]);
		System.out.println(age5[2]);
		System.out.println(age5[3]);
		System.out.println(age5[4]);
		
		//배열 선언후 값할당 
		System.out.println();
		
		int [] age6;
		age6= new int [] {100,200,300,400,500,600};
		
		System.out.println(age6[0]);
		System.out.println(age6[1]);
		System.out.println(age6[2]);
		System.out.println(age6[3]);
		System.out.println(age6[4]);
		System.out.println(age6[5]);
		
		System.out.println();
		System.out.println("------------------배열 : 선언방법4------------------");
		
		//배열 선언과 동시에 값 할당 : 선언과 값할당 분리시 오류 발생 
		int []age7 = {11,22,33,44,55};
		
		System.out.println(age7[0]);
		System.out.println(age7[1]);
		System.out.println(age7[2]);
		System.out.println(age7[3]);
		System.out.println(age7[4]);
		
		//선언과 값을 분리시 오류 발생
		int[]age8;
	// age8 = {111,222,333,444,555}; //오류발생 
		
		
		
		
		
		
		
		
		
		
	}

}
