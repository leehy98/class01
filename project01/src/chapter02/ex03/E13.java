package chapter02.ex03;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		//스캐너로 인풋받은 값을 선택시 해당 내용을 이중 for문을 사용해서 출력
		//4 프로그램 종료시 까지 무한루프를 돌려서 작동
		//1~4 번 외의 내용 선택시 잘못된 입력입니다 1~4 까지만 넣어주세요 출력
		System.out.println("-------------------------------------------------");
		System.out.println("1.구구단 | 2.19단출력 | 3.19단 중 7배수단 | 4.프로그램 종료");
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("보시기 원하는 단을 선택하세요");
			int a =sc.nextInt();
			if( a == 1) {
				System.out.println("구구단 출력");
				for (int b =1; b<10; b++) {
					System.out.println(b + "단 출력");
					for(int c=1; c<10; c++) {
						System.out.println(b +" * "+c+" = "+ b*c);
					}
				}
			}else if (a == 2 ) {
				System.out.println("19단 출력");
				for (int b = 1 ; b <20 ; b++) {
					System.out.println(b + "단 출력");
					for (int c = 1 ; c <20; c++) {
						System.out.println(b +" * "+c+" = "+b*c);
					}
				}
			}else if (a == 3) {
				System.out.println("19단 중 7배수단 출력");
				
				for (int b = 1 ; b <20 ; b++) {
					if(b%7==0) {
						System.out.println(b + "단 출력");
						for (int c = 1 ; c <20; c++) {
							System.out.println(b +" * "+c+" = "+b*c);
						}	
					}
					
				}
			}else if (a == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("잘못된 입력입니다 1~4 까지만 넣어주세요");
			}
		}while(true);
		
		
		
		
		
		
		
		
	}
	
}
