package chapter02.ex03;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		// do while문으로 무한루프를 돌립니다.
		// 스캐너에서 정수1을 넣으면 평균 출력 2 합계출력 3이름 출력 4 프로그램 종료
		System.out.println("------------------------------------------------");
		System.out.println("1. 평균 출력 | 2.합계 출력 | 3. 이름 출력 | 4.프로그램 종료");
		System.out.println("------------------------------------------------");
		int select; 
		 
		Scanner input = new Scanner(System.in);
		System.out.println("위 번호를 선택하세요>>>>");
		select = input.nextInt();
		if(select == 1) {
			int a;
			int b;
			int c;
			
			System.out.println("국어점수");
			a = input.nextInt();
			System.out.println("영어점수");
			b = input.nextInt();
			System.out.println("수학점수");
			c = input.nextInt();
			int sum ;
			sum = a+b+c;
			double avg;        
			avg = sum/3.0;
			System.out.println("합계는"+ sum  );
		}else if (select ==2) {
			
		}
		
		
	}

}
