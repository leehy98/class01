package chapter02.ex02;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		// 문제 스케너로 1월 ~ 12월 까지 인풋 받아서 해당월의 일수 출력
		// 출력 : 1 월은 31일 입니다
		//		 2 월은 28일 입니다
		// 		월은 month 일day 입니다
		// switch 문으로 작성 :
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("1월 ~ 12월에 해당하는 숫자를 입력하세요");
		int month = input.nextInt();
		int day = 30;
		switch(month) {
		case 1: 
			System.out.println("1월은 31일 입니다");
			break;
		case 2:
			System.out.println("2월은 28일 입니다");
			break;
		case 3:
			System.out.println("3월은 31일 입니다");
			break;
		case 4:
			System.out.println("4월은 30일 입니다");
			break;
		case 5:
			System.out.println("5월은 31일 입니다");
			break;
		case 6:
			System.out.println("6월은 30일 입니다");
			break;
		case 7:
			System.out.println("7월은 31일 입니다");
			break;
		case 8:
			System.out.println("8월은 31일 입니다");
			break;
		case 9:
			System.out.println("9월은 30일 입니다");
			break;
		case 10:
			System.out.println("10월은 31일 입니다");
			break;
		case 11:
			System.out.println("11월은 30일 입니다");
			break;
		case 12:
			System.out.println("12월은 31일 입니다");
	  }
	}
}
