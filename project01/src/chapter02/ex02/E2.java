package chapter02.ex02;

import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		// <<실습문제>> 완료시간 6: 10 p.jangwoo@gmail.com 메일 보내기
		// 정수 2개를 Scanner 로 인풋 받고 두값이 같으면 ture 를 출력 다르면 false 출력
		// 이름 2개를 Scanner 로 인풋 받고 두값이 같으면 ture 를 출력 다르면 false 출력
			// 등가연산 사용. 
		
		// 기본자료형 : ==
		int a;
		int b;
		// 참조자료형 : .equals()
		String aName = new String("1");
		String bName = new String("1");
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("1 x 1");
		a = sc.nextInt();
		System.out.println("1 x 1");
		b = sc.nextInt();
		System.out.println("1 x 1");
		aName = sc.next();
		System.out.println("1 x 1");
		bName = sc.next();
		
		System.out.println("기본자료형" + (a == b));
		System.out.println("참조자료형" + aName.equals(bName));

		
		
		
		
		
		
		
		
		
		
		
	}

}
