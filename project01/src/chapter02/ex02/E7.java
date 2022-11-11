package chapter02.ex02;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		//<문제>  switch 문을 사용하여 프로그램 짜기
		//스캐너로 정수 1 을 인풋 받으면 "금매달 입니다" 출력
		//          2 을 인풋 받으면 "은매달 입니다" 출력
		//			3 을 인풋 받으면 "동매달 입니다" 출력
		//		그외값을 을 인풋 받으면 "매달이 없습니다" 출력	
		
		//문제 2 스캐너로 문자열 gold   인풋 받으면 금매달입니다 출력
		//                 silver 인풋 받으면 "은매달 입니다" 출력
		//			       bronze 인풋 받으면 "동매달 입니다" 출력
		//		           그외값을 을 인풋 받으면 "매달이 없습니다" 출력	
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수값 1~3또는 아무정수나 입력하세요");
		int medal = input.nextInt();
		switch (medal) {
		case 1:
			System.out.println("금매달 입니다");
			break;
		case 2:
			System.out.println("은매달 입니다");
			break;
		case 3: 
			System.out.println("동매달 입니다");
			break;
		default :
			System.out.println("매달이 없습니다");	
		}
		
		System.out.println("영어로 골드 실버 브론즈 또는 아무거나 입력하세요");
		String medal2;
		medal2 = input.next();
		switch (medal2) {
		case "gold":
			System.out.println("금매달 입니다");
			break;
		case "silver":
			System.out.println("은매달 입니다");
			break;
		case "bronze": 
			System.out.println("동매달 입니다");
			break;
		default :
			System.out.println("매달이 없습니다");	
		
		}
		input.close();
	}
}

