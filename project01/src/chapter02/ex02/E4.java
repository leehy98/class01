package chapter02.ex02;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
// 문제 2 스캐너로 3 6 9의 배수이면 3 6 9 의 배수입니다 그렇지 않으면 3 6 9 의 배수가 아닙니다 출력
		
		Scanner input = new Scanner (System.in);
		System.out.println("3,6,9의 배수를 입력하세요");
		int number = input.nextInt();
		if (number % 3 == 0) {
			System.out.println("3,6,9의 배수입니다");
		}else {
			System.out.println("3,6,9의 배수가 아닙니다");
		} 
		
		
		
		
		
		
	}

}
